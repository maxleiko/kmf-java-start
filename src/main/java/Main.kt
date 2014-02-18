import org.kevoree.KevoreeFactory
import org.kevoree.impl.DefaultKevoreeFactory
import org.kevoree.ContainerRoot
import org.kevoree.ContainerNode

fun main(args: Array<String>) {
    var factory : KevoreeFactory = DefaultKevoreeFactory();
    var model : ContainerRoot = factory.createContainerRoot();
    var node : ContainerNode = factory.createContainerNode();
    node.name = "potato";
    model.addNodes(node);
    println("Node name: "+model.nodes.get(0).name);
}