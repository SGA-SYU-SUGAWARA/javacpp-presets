// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// FieldRef

/** \class FieldPath
 * 
 *  Represents a path to a nested field using indices of child fields.
 *  For example, given indices {5, 9, 3} the field would be retrieved with
 *  schema->field(5)->type()->child(9)->type()->child(3)
 * 
 *  Attempting to retrieve a child field using a FieldPath which is not valid for
 *  a given schema will raise an error. Invalid FieldPaths include:
 *  - an index is out of range
 *  - the path is empty (note: a default constructed FieldPath will be empty)
 * 
 *  FieldPaths provide a number of accessors for drilling down to potentially nested
 *  children. They are overloaded for convenience to support Schema (returns a field),
 *  DataType (returns a child field), Field (returns a child field of this field's type)
 *  Array (returns a child array), RecordBatch (returns a column), ChunkedArray (returns a
 *  ChunkedArray where each chunk is a child array of the corresponding original chunk)
 *  and Table (returns a column). */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FieldPath extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldPath(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FieldPath(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FieldPath position(long position) {
        return (FieldPath)super.position(position);
    }

  public FieldPath() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FieldPath(@StdVector IntPointer indices) { super((Pointer)null); allocate(indices); }
  private native void allocate(@StdVector IntPointer indices);
  public FieldPath(@StdVector IntBuffer indices) { super((Pointer)null); allocate(indices); }
  private native void allocate(@StdVector IntBuffer indices);
  public FieldPath(@StdVector int[] indices) { super((Pointer)null); allocate(indices); }
  private native void allocate(@StdVector int[] indices);

  public native @StdString String ToString();

  public native @Cast("size_t") long hash();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FieldPath other);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef FieldPath other);

  public native @StdVector IntPointer indices();

  /** \brief Retrieve the referenced child Field from a Schema, Field, or DataType */
  public native @ByVal FieldResult Get(@Const @ByRef Schema schema);
  public native @ByVal FieldResult Get(@Const @ByRef Field field);
  public native @ByVal FieldResult Get(@Const @ByRef DataType type);
  public native @ByVal FieldResult Get(@Const @ByRef FieldVector fields);

  /** \brief Retrieve the referenced column from a RecordBatch or Table */
  public native @ByVal ArrayResult Get(@Const @ByRef RecordBatch batch);
  public native @ByVal ChunkedArrayResult Get(@Const @ByRef Table table);

  /** \brief Retrieve the referenced child Array from an Array or ChunkedArray */
  public native @ByVal ArrayResult Get(@Const @ByRef Array array);
  public native @ByVal ChunkedArrayResult Get(@Const @ByRef ChunkedArray array);
}