/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextMenu;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author User
 */
@ManagedBean
@ViewScoped
public class ContextMenuController implements Serializable {

    private TreeNode root;
    private TreeNode selectedNode;

    @PostConstruct
    protected void initialize() {
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("Folder 0", root);
        
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public void onNodeSelect(NodeSelectEvent event) {
        selectedNode = event.getTreeNode();
    }

    public void onNodeUnselect(NodeUnselectEvent event) {
        selectedNode = null;
    }

    public void viewNode() {
        if (selectedNode == null) {
            return;
        }
        FacesMessage msg
                = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Selected", selectedNode.getData().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void deleteNode() {
        if (selectedNode == null) {
            return;
        }
        selectedNode.getChildren().clear();
        selectedNode.getParent().getChildren().
                remove(selectedNode);
        selectedNode.setParent(null);
        selectedNode = null;
    }
}
