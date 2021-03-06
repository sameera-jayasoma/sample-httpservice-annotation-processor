package org.sameerajayasoma.sample.httpservice.annotation;

import org.ballerinalang.compiler.plugins.AbstractCompilerPlugin;
import org.ballerinalang.compiler.plugins.SupportedAnnotationPackages;
import org.ballerinalang.model.tree.ActionNode;
import org.ballerinalang.model.tree.AnnotationAttachmentNode;
import org.ballerinalang.model.tree.AnnotationNode;
import org.ballerinalang.model.tree.ConnectorNode;
import org.ballerinalang.model.tree.EnumNode;
import org.ballerinalang.model.tree.FunctionNode;
import org.ballerinalang.model.tree.ResourceNode;
import org.ballerinalang.model.tree.ServiceNode;
import org.ballerinalang.model.tree.StructNode;
import org.ballerinalang.model.tree.TransformerNode;
import org.ballerinalang.util.diagnostic.Diagnostic;
import org.ballerinalang.util.diagnostic.DiagnosticLog;

import java.io.PrintStream;
import java.nio.file.Path;
import java.util.List;

/**
 * This class validates annotations attached to Ballerina service and resource nodes.
 *
 * @since 1.0
 */
@SupportedAnnotationPackages(
        value = "ballerina.net.http"
)
public class HTTPServiceAnnotationValidator extends AbstractCompilerPlugin {
    DiagnosticLog dlog;
    PrintStream out = System.out;

    public void init(DiagnosticLog diagnosticLog) {
        this.dlog = diagnosticLog;
    }


    @Override
    public void process(ServiceNode serviceNode, List<AnnotationAttachmentNode> annotations) {
        out.println("service node: " + serviceNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }

        // This is how you can report compilation errors, warnings, and messages.
        dlog.logDiagnostic(Diagnostic.Kind.WARNING, serviceNode.getPosition(), "Dummy warning message");
    }

    @Override
    public void process(ResourceNode resourceNode, List<AnnotationAttachmentNode> annotations) {
        out.println("resource node: " + resourceNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void process(ConnectorNode connectorNode, List<AnnotationAttachmentNode> annotations) {
        out.println("connector node: " + connectorNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void process(ActionNode actionNode, List<AnnotationAttachmentNode> annotations) {
        out.println("action node: " + actionNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void process(StructNode structNode, List<AnnotationAttachmentNode> annotations) {
        out.println("struct node: " + structNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void process(EnumNode enumNode, List<AnnotationAttachmentNode> annotations) {
        out.println("enum node: " + enumNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void process(FunctionNode functionNode, List<AnnotationAttachmentNode> annotations) {
        out.println("function node: " + functionNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void process(AnnotationNode annotationNode, List<AnnotationAttachmentNode> annotations) {
        out.println("annotation node: " + annotationNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void process(TransformerNode transformerNode, List<AnnotationAttachmentNode> annotations) {
        out.println("transformer node: " + transformerNode.getName().getValue());
        for (AnnotationAttachmentNode attachmentNode : annotations) {
            out.println(attachmentNode.getAnnotationName().getValue());
        }
    }

    @Override
    public void codeGenerated(Path binaryPath) {
        out.println("executed code path: " + binaryPath);
    }
}
