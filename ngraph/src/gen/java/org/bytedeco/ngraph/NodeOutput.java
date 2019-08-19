// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    /** \brief A handle for one of a node's outputs. */
    @Name("ngraph::Output<ngraph::Node>") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class NodeOutput extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public NodeOutput(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public NodeOutput(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public NodeOutput position(long position) {
            return (NodeOutput)super.position(position);
        }
    
        /** \brief Constructs a Output.
         *  @param node A pointer to the node for the output handle.
         *  @param index The index of the output. */
        
        ///
        public NodeOutput(Node node, @Cast("size_t") long index) { super((Pointer)null); allocate(node, index); }
        private native void allocate(Node node, @Cast("size_t") long index);

        /** \brief Constructs a Output.
         *  @param node A {@code shared_ptr} to the node for the output handle.
         *  @param index The index of the output.
         * 
         *  TODO: Make a plan to deprecate this. */

        /** \brief Constructs a Output, referencing the zeroth output of the node.
         *  @param node A {@code shared_ptr} to the node for the output handle. */
        public NodeOutput(Node node) { super((Pointer)null); allocate(node); }
        private native void allocate(@Cast({"", "const std::shared_ptr<ngraph::Node>&"}) @SharedPtr Node node);

        /** A null output */
        public NodeOutput() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** This output position for a different node */
        public native @ByVal NodeOutput for_node(@Const @SharedPtr @ByRef Node node);

        /** @return A pointer to the node referred to by this output handle. */
        
        ///
        public native Node get_node();
        /** @return A {@code shared_ptr} to the node referred to by this output handle.
         * 
         *  TODO: Make a plan to deprecate this. */
        public native @SharedPtr @ByVal Node get_node_shared_ptr();
        /** @return A useable shared pointer to this output. If index 0, the node,
         *  otherwise find or create a GOE. */
        public native @SharedPtr @ByVal Node as_single_output_node();

        /** @return The index of the output referred to by this output handle. */
        public native @Cast("size_t") long get_index();
        /** @return A reference to the tensor descriptor for this output. */
        public native @ByRef DescriptorTensor get_tensor();
        /** @return A shared point to the tensor ptr for this output. */
        public native @SharedPtr @ByVal DescriptorTensor get_tensor_ptr();
        /** @return The element type of the output referred to by this output handle. */
        public native @Const @ByRef Type get_element_type();
        /** @return The shape of the output referred to by this output handle. */
        public native @Const @ByRef Shape get_shape();
        /** @return The partial shape of the output referred to by this output handle. */
        public native @Const @ByRef PartialShape get_partial_shape();

        /** @return A set containing handles for all inputs targeted by the output referenced by
         *         this output handle. */

        /** \brief Removes a target input from the output referenced by this output handle.
         *  @param target_input The target input to remove.
         *  */
        // TODO(amprocte): Investigate whether this really ought to be public.
        public native void remove_target_input(@Const @ByRef NodeInput target_input);

        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef NodeOutput other);
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef NodeOutput other);
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef NodeOutput other);
        public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef NodeOutput other);
        public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef NodeOutput other);
        public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef NodeOutput other);
    }
