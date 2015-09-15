// Targeted by JavaCPP version 1.1-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.cuda.*;
import static org.bytedeco.javacpp.cufft.*;

public class cufftw extends org.bytedeco.javacpp.presets.cufftw {
    static { Loader.load(); }

// Parsed from <cufftw.h>


 /* Copyright 2005-2014 NVIDIA Corporation.  All rights reserved.
  *
  * NOTICE TO LICENSEE:
  *
  * The source code and/or documentation ("Licensed Deliverables") are
  * subject to NVIDIA intellectual property rights under U.S. and
  * international Copyright laws.
  *
  * The Licensed Deliverables contained herein are PROPRIETARY and
  * CONFIDENTIAL to NVIDIA and are being provided under the terms and
  * conditions of a form of NVIDIA software license agreement by and
  * between NVIDIA and Licensee ("License Agreement") or electronically
  * accepted by Licensee.  Notwithstanding any terms or conditions to
  * the contrary in the License Agreement, reproduction or disclosure
  * of the Licensed Deliverables to any third party without the express
  * written consent of NVIDIA is prohibited.
  *
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
  * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
  * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  THEY ARE
  * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
  * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
  * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
  * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
  * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
  * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
  * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
  * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
  * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
  * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
  * OF THESE LICENSED DELIVERABLES.
  *
  * U.S. Government End Users.  These Licensed Deliverables are a
  * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
  * 1995), consisting of "commercial computer software" and "commercial
  * computer software documentation" as such terms are used in 48
  * C.F.R. 12.212 (SEPT 1995) and are provided to the U.S. Government
  * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
  * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
  * U.S. Government End Users acquire the Licensed Deliverables with
  * only those rights set forth herein.
  *
  * Any use of the Licensed Deliverables in individual and commercial
  * software must include, in the user documentation and internal
  * comments to the code, the above Disclaimer and U.S. Government End
  * Users Notice.
  */

/**
* \file cufftw.h
* \brief Public header file for the NVIDIA CUDA FFTW library (CUFFTW)
*/

// #ifndef _CUFFTW_H_
// #define _CUFFTW_H_


// #include <stdio.h>
// #include "cufft.h"

// #ifndef CUFFTAPI
// #ifdef _WIN32
// #define CUFFTAPI __stdcall
// #else
// #define CUFFTAPI 
// #endif
// #endif

// #ifdef __cplusplus
// #endif

// transform direction
public static final int FFTW_FORWARD = -1;
public static final int FFTW_INVERSE =  1;
public static final int FFTW_BACKWARD = 1;

// Planner flags

public static final int FFTW_ESTIMATE =           0x01;
public static final int FFTW_MEASURE =            0x02;
public static final int FFTW_PATIENT =            0x03;
public static final int FFTW_EXHAUSTIVE =         0x04;
public static final int FFTW_WISDOM_ONLY =        0x05;

//Algorithm restriction flags

public static final int FFTW_DESTROY_INPUT =      0x08;
public static final int FFTW_PRESERVE_INPUT =     0x0C;
public static final int FFTW_UNALIGNED =          0x10;
    
// CUFFTW defines and supports the following data types

// note if complex.h has been included we use the C99 complex types
// #if !defined(FFTW_NO_Complex) && defined(_Complex_I) && defined (complex)
// #else
// #endif

@Namespace @Name("void") @Opaque public static class fftw_plan extends Pointer {
    /** Empty constructor. */
    public fftw_plan() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_plan(Pointer p) { super(p); }
}

@Namespace @Name("void") @Opaque public static class fftwf_plan extends Pointer {
    /** Empty constructor. */
    public fftwf_plan() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftwf_plan(Pointer p) { super(p); }
}

public static class fftw_iodim extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public fftw_iodim() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public fftw_iodim(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public fftw_iodim position(int position) {
        return (fftw_iodim)super.position(position);
    }

    public native int n(); public native fftw_iodim n(int n);
    public native int is(); public native fftw_iodim is(int is);
    public native int os(); public native fftw_iodim os(int os);
}
    
public static class fftw_iodim64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public fftw_iodim64() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public fftw_iodim64(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public fftw_iodim64 position(int position) {
        return (fftw_iodim64)super.position(position);
    }

    public native int n(); public native fftw_iodim64 n(int n);
    public native @Cast("size_t") long is(); public native fftw_iodim64 is(long is);
    public native @Cast("size_t") long os(); public native fftw_iodim64 os(long os);
}
    

// CUFFTW defines and supports the following double precision APIs


public static native fftw_plan fftw_plan_dft_1d(int n, 
                                    @Cast("fftw_complex*") DoublePointer in,
                                    @Cast("fftw_complex*") DoublePointer out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_1d(int n, 
                                    @Cast("fftw_complex*") DoubleBuffer in,
                                    @Cast("fftw_complex*") DoubleBuffer out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_1d(int n, 
                                    @Cast("fftw_complex*") double[] in,
                                    @Cast("fftw_complex*") double[] out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_2d(int n0,
                                    int n1, 
                                    @Cast("fftw_complex*") DoublePointer in,
                                    @Cast("fftw_complex*") DoublePointer out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_2d(int n0,
                                    int n1, 
                                    @Cast("fftw_complex*") DoubleBuffer in,
                                    @Cast("fftw_complex*") DoubleBuffer out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_2d(int n0,
                                    int n1, 
                                    @Cast("fftw_complex*") double[] in,
                                    @Cast("fftw_complex*") double[] out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_3d(int n0,
                                    int n1,
                                    int n2, 
                                    @Cast("fftw_complex*") DoublePointer in,
                                    @Cast("fftw_complex*") DoublePointer out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_3d(int n0,
                                    int n1,
                                    int n2, 
                                    @Cast("fftw_complex*") DoubleBuffer in,
                                    @Cast("fftw_complex*") DoubleBuffer out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_3d(int n0,
                                    int n1,
                                    int n2, 
                                    @Cast("fftw_complex*") double[] in,
                                    @Cast("fftw_complex*") double[] out, 
                                    int sign, 
                                    @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft(int rank,
                                 @Const IntPointer n,
                                 @Cast("fftw_complex*") DoublePointer in,
                                 @Cast("fftw_complex*") DoublePointer out, 
                                 int sign, 
                                 @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft(int rank,
                                 @Const IntBuffer n,
                                 @Cast("fftw_complex*") DoubleBuffer in,
                                 @Cast("fftw_complex*") DoubleBuffer out, 
                                 int sign, 
                                 @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft(int rank,
                                 @Const int[] n,
                                 @Cast("fftw_complex*") double[] in,
                                 @Cast("fftw_complex*") double[] out, 
                                 int sign, 
                                 @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_r2c_1d(int n, 
                                        DoublePointer in,
                                        @Cast("fftw_complex*") DoublePointer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_1d(int n, 
                                        DoubleBuffer in,
                                        @Cast("fftw_complex*") DoubleBuffer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_1d(int n, 
                                        double[] in,
                                        @Cast("fftw_complex*") double[] out, 
                                        @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_r2c_2d(int n0,
                                        int n1, 
                                        DoublePointer in,
                                        @Cast("fftw_complex*") DoublePointer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_2d(int n0,
                                        int n1, 
                                        DoubleBuffer in,
                                        @Cast("fftw_complex*") DoubleBuffer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_2d(int n0,
                                        int n1, 
                                        double[] in,
                                        @Cast("fftw_complex*") double[] out, 
                                        @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_r2c_3d(int n0,
                                        int n1,
                                        int n2, 
                                        DoublePointer in,
                                        @Cast("fftw_complex*") DoublePointer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_3d(int n0,
                                        int n1,
                                        int n2, 
                                        DoubleBuffer in,
                                        @Cast("fftw_complex*") DoubleBuffer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_3d(int n0,
                                        int n1,
                                        int n2, 
                                        double[] in,
                                        @Cast("fftw_complex*") double[] out, 
                                        @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_r2c(int rank,
                                     @Const IntPointer n,
                                     DoublePointer in,
                                     @Cast("fftw_complex*") DoublePointer out, 
                                     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c(int rank,
                                     @Const IntBuffer n,
                                     DoubleBuffer in,
                                     @Cast("fftw_complex*") DoubleBuffer out, 
                                     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c(int rank,
                                     @Const int[] n,
                                     double[] in,
                                     @Cast("fftw_complex*") double[] out, 
                                     @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_c2r_1d(int n, 
                                        @Cast("fftw_complex*") DoublePointer in,
                                        DoublePointer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_1d(int n, 
                                        @Cast("fftw_complex*") DoubleBuffer in,
                                        DoubleBuffer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_1d(int n, 
                                        @Cast("fftw_complex*") double[] in,
                                        double[] out, 
                                        @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_c2r_2d(int n0,
                                        int n1, 
                                        @Cast("fftw_complex*") DoublePointer in,
                                        DoublePointer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_2d(int n0,
                                        int n1, 
                                        @Cast("fftw_complex*") DoubleBuffer in,
                                        DoubleBuffer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_2d(int n0,
                                        int n1, 
                                        @Cast("fftw_complex*") double[] in,
                                        double[] out, 
                                        @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_c2r_3d(int n0,
                                        int n1,
                                        int n2, 
                                        @Cast("fftw_complex*") DoublePointer in,
                                        DoublePointer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_3d(int n0,
                                        int n1,
                                        int n2, 
                                        @Cast("fftw_complex*") DoubleBuffer in,
                                        DoubleBuffer out, 
                                        @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_3d(int n0,
                                        int n1,
                                        int n2, 
                                        @Cast("fftw_complex*") double[] in,
                                        double[] out, 
                                        @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_c2r(int rank,
                                     @Const IntPointer n,
                                     @Cast("fftw_complex*") DoublePointer in,
                                     DoublePointer out, 
                                     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r(int rank,
                                     @Const IntBuffer n,
                                     @Cast("fftw_complex*") DoubleBuffer in,
                                     DoubleBuffer out, 
                                     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r(int rank,
                                     @Const int[] n,
                                     @Cast("fftw_complex*") double[] in,
                                     double[] out, 
                                     @Cast("unsigned") int flags);


public static native fftw_plan fftw_plan_many_dft(int rank,
                                      @Const IntPointer n,
                                      int batch,
                                      @Cast("fftw_complex*") DoublePointer in,
                                      @Const IntPointer inembed, int istride, int idist,
                                      @Cast("fftw_complex*") DoublePointer out,
                                      @Const IntPointer onembed, int ostride, int odist,
                                      int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft(int rank,
                                      @Const IntBuffer n,
                                      int batch,
                                      @Cast("fftw_complex*") DoubleBuffer in,
                                      @Const IntBuffer inembed, int istride, int idist,
                                      @Cast("fftw_complex*") DoubleBuffer out,
                                      @Const IntBuffer onembed, int ostride, int odist,
                                      int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft(int rank,
                                      @Const int[] n,
                                      int batch,
                                      @Cast("fftw_complex*") double[] in,
                                      @Const int[] inembed, int istride, int idist,
                                      @Cast("fftw_complex*") double[] out,
                                      @Const int[] onembed, int ostride, int odist,
                                      int sign, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_many_dft_r2c(int rank,
                                          @Const IntPointer n,
                                          int batch,
                                          DoublePointer in,
                                          @Const IntPointer inembed, int istride, int idist,
                                          @Cast("fftw_complex*") DoublePointer out,
                                          @Const IntPointer onembed, int ostride, int odist,
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_r2c(int rank,
                                          @Const IntBuffer n,
                                          int batch,
                                          DoubleBuffer in,
                                          @Const IntBuffer inembed, int istride, int idist,
                                          @Cast("fftw_complex*") DoubleBuffer out,
                                          @Const IntBuffer onembed, int ostride, int odist,
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_r2c(int rank,
                                          @Const int[] n,
                                          int batch,
                                          double[] in,
                                          @Const int[] inembed, int istride, int idist,
                                          @Cast("fftw_complex*") double[] out,
                                          @Const int[] onembed, int ostride, int odist,
                                          @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_many_dft_c2r(int rank,
                                          @Const IntPointer n,
                                          int batch,
                                          @Cast("fftw_complex*") DoublePointer in,
                                          @Const IntPointer inembed, int istride, int idist,
                                          DoublePointer out,
                                          @Const IntPointer onembed, int ostride, int odist,
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_c2r(int rank,
                                          @Const IntBuffer n,
                                          int batch,
                                          @Cast("fftw_complex*") DoubleBuffer in,
                                          @Const IntBuffer inembed, int istride, int idist,
                                          DoubleBuffer out,
                                          @Const IntBuffer onembed, int ostride, int odist,
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_c2r(int rank,
                                          @Const int[] n,
                                          int batch,
                                          @Cast("fftw_complex*") double[] in,
                                          @Const int[] inembed, int istride, int idist,
                                          double[] out,
                                          @Const int[] onembed, int ostride, int odist,
                                          @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru_dft(int rank, @Const fftw_iodim dims,
                                      int batch_rank, @Const fftw_iodim batch_dims,
                                      @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out,
                                      int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft(int rank, @Const fftw_iodim dims,
                                      int batch_rank, @Const fftw_iodim batch_dims,
                                      @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out,
                                      int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft(int rank, @Const fftw_iodim dims,
                                      int batch_rank, @Const fftw_iodim batch_dims,
                                      @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out,
                                      int sign, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru_dft_r2c(int rank, @Const fftw_iodim dims,
                                          int batch_rank, @Const fftw_iodim batch_dims,
                                          DoublePointer in, @Cast("fftw_complex*") DoublePointer out, 
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_r2c(int rank, @Const fftw_iodim dims,
                                          int batch_rank, @Const fftw_iodim batch_dims,
                                          DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, 
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_r2c(int rank, @Const fftw_iodim dims,
                                          int batch_rank, @Const fftw_iodim batch_dims,
                                          double[] in, @Cast("fftw_complex*") double[] out, 
                                          @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru_dft_c2r(int rank, @Const fftw_iodim dims,
                                          int batch_rank, @Const fftw_iodim batch_dims,
                                          @Cast("fftw_complex*") DoublePointer in, DoublePointer out, 
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_c2r(int rank, @Const fftw_iodim dims,
                                          int batch_rank, @Const fftw_iodim batch_dims,
                                          @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out, 
                                          @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_c2r(int rank, @Const fftw_iodim dims,
                                          int batch_rank, @Const fftw_iodim batch_dims,
                                          @Cast("fftw_complex*") double[] in, double[] out, 
                                          @Cast("unsigned") int flags);

public static native void fftw_execute(fftw_plan plan);

public static native void fftw_execute_dft(fftw_plan plan, 
                               @Cast("fftw_complex*") DoublePointer idata,
                               @Cast("fftw_complex*") DoublePointer odata);
public static native void fftw_execute_dft(fftw_plan plan, 
                               @Cast("fftw_complex*") DoubleBuffer idata,
                               @Cast("fftw_complex*") DoubleBuffer odata);
public static native void fftw_execute_dft(fftw_plan plan, 
                               @Cast("fftw_complex*") double[] idata,
                               @Cast("fftw_complex*") double[] odata);

public static native void fftw_execute_dft_r2c(fftw_plan plan, 
                                   DoublePointer idata,
                                   @Cast("fftw_complex*") DoublePointer odata);
public static native void fftw_execute_dft_r2c(fftw_plan plan, 
                                   DoubleBuffer idata,
                                   @Cast("fftw_complex*") DoubleBuffer odata);
public static native void fftw_execute_dft_r2c(fftw_plan plan, 
                                   double[] idata,
                                   @Cast("fftw_complex*") double[] odata);

public static native void fftw_execute_dft_c2r(fftw_plan plan, 
                                   @Cast("fftw_complex*") DoublePointer idata,
                                   DoublePointer odata);
public static native void fftw_execute_dft_c2r(fftw_plan plan, 
                                   @Cast("fftw_complex*") DoubleBuffer idata,
                                   DoubleBuffer odata);
public static native void fftw_execute_dft_c2r(fftw_plan plan, 
                                   @Cast("fftw_complex*") double[] idata,
                                   double[] odata);
                                   
                                   
// CUFFTW defines and supports the following single precision APIs

public static native fftwf_plan fftwf_plan_dft_1d(int n, 
                                      @Cast("fftwf_complex*") FloatPointer in,
                                      @Cast("fftwf_complex*") FloatPointer out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_1d(int n, 
                                      @Cast("fftwf_complex*") FloatBuffer in,
                                      @Cast("fftwf_complex*") FloatBuffer out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_1d(int n, 
                                      @Cast("fftwf_complex*") float[] in,
                                      @Cast("fftwf_complex*") float[] out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);
                                   
public static native fftwf_plan fftwf_plan_dft_2d(int n0,
                                      int n1, 
                                      @Cast("fftwf_complex*") FloatPointer in,
                                      @Cast("fftwf_complex*") FloatPointer out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_2d(int n0,
                                      int n1, 
                                      @Cast("fftwf_complex*") FloatBuffer in,
                                      @Cast("fftwf_complex*") FloatBuffer out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_2d(int n0,
                                      int n1, 
                                      @Cast("fftwf_complex*") float[] in,
                                      @Cast("fftwf_complex*") float[] out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_3d(int n0,
                                      int n1,
                                      int n2, 
                                      @Cast("fftwf_complex*") FloatPointer in,
                                      @Cast("fftwf_complex*") FloatPointer out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_3d(int n0,
                                      int n1,
                                      int n2, 
                                      @Cast("fftwf_complex*") FloatBuffer in,
                                      @Cast("fftwf_complex*") FloatBuffer out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_3d(int n0,
                                      int n1,
                                      int n2, 
                                      @Cast("fftwf_complex*") float[] in,
                                      @Cast("fftwf_complex*") float[] out, 
                                      int sign, 
                                      @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft(int rank,
                                   @Const IntPointer n,
                                   @Cast("fftwf_complex*") FloatPointer in,
                                   @Cast("fftwf_complex*") FloatPointer out, 
                                   int sign, 
                                   @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft(int rank,
                                   @Const IntBuffer n,
                                   @Cast("fftwf_complex*") FloatBuffer in,
                                   @Cast("fftwf_complex*") FloatBuffer out, 
                                   int sign, 
                                   @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft(int rank,
                                   @Const int[] n,
                                   @Cast("fftwf_complex*") float[] in,
                                   @Cast("fftwf_complex*") float[] out, 
                                   int sign, 
                                   @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_r2c_1d(int n, 
                                          FloatPointer in,
                                          @Cast("fftwf_complex*") FloatPointer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_1d(int n, 
                                          FloatBuffer in,
                                          @Cast("fftwf_complex*") FloatBuffer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_1d(int n, 
                                          float[] in,
                                          @Cast("fftwf_complex*") float[] out, 
                                          @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_r2c_2d(int n0,
                                          int n1, 
                                          FloatPointer in,
                                          @Cast("fftwf_complex*") FloatPointer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_2d(int n0,
                                          int n1, 
                                          FloatBuffer in,
                                          @Cast("fftwf_complex*") FloatBuffer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_2d(int n0,
                                          int n1, 
                                          float[] in,
                                          @Cast("fftwf_complex*") float[] out, 
                                          @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_r2c_3d(int n0,
                                          int n1,
                                          int n2, 
                                          FloatPointer in,
                                          @Cast("fftwf_complex*") FloatPointer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_3d(int n0,
                                          int n1,
                                          int n2, 
                                          FloatBuffer in,
                                          @Cast("fftwf_complex*") FloatBuffer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_3d(int n0,
                                          int n1,
                                          int n2, 
                                          float[] in,
                                          @Cast("fftwf_complex*") float[] out, 
                                          @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_r2c(int rank,
                                       @Const IntPointer n,
                                       FloatPointer in,
                                       @Cast("fftwf_complex*") FloatPointer out, 
                                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c(int rank,
                                       @Const IntBuffer n,
                                       FloatBuffer in,
                                       @Cast("fftwf_complex*") FloatBuffer out, 
                                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c(int rank,
                                       @Const int[] n,
                                       float[] in,
                                       @Cast("fftwf_complex*") float[] out, 
                                       @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_c2r_1d(int n, 
                                          @Cast("fftwf_complex*") FloatPointer in,
                                          FloatPointer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_1d(int n, 
                                          @Cast("fftwf_complex*") FloatBuffer in,
                                          FloatBuffer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_1d(int n, 
                                          @Cast("fftwf_complex*") float[] in,
                                          float[] out, 
                                          @Cast("unsigned") int flags);
                                      
public static native fftwf_plan fftwf_plan_dft_c2r_2d(int n0,
                                          int n1, 
                                          @Cast("fftwf_complex*") FloatPointer in,
                                          FloatPointer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_2d(int n0,
                                          int n1, 
                                          @Cast("fftwf_complex*") FloatBuffer in,
                                          FloatBuffer out, 
                                          @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_2d(int n0,
                                          int n1, 
                                          @Cast("fftwf_complex*") float[] in,
                                          float[] out, 
                                          @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_c2r_3d(int n0,
                                        int n1,
                                        int n2, 
                                        @Cast("fftwf_complex*") FloatPointer in,
                                        FloatPointer out, 
                                        @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_3d(int n0,
                                        int n1,
                                        int n2, 
                                        @Cast("fftwf_complex*") FloatBuffer in,
                                        FloatBuffer out, 
                                        @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_3d(int n0,
                                        int n1,
                                        int n2, 
                                        @Cast("fftwf_complex*") float[] in,
                                        float[] out, 
                                        @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_c2r(int rank,
                                       @Const IntPointer n,
                                       @Cast("fftwf_complex*") FloatPointer in,
                                       FloatPointer out, 
                                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r(int rank,
                                       @Const IntBuffer n,
                                       @Cast("fftwf_complex*") FloatBuffer in,
                                       FloatBuffer out, 
                                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r(int rank,
                                       @Const int[] n,
                                       @Cast("fftwf_complex*") float[] in,
                                       float[] out, 
                                       @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_many_dft(int rank,
                                        @Const IntPointer n,
                                        int batch,
                                        @Cast("fftwf_complex*") FloatPointer in,
                                        @Const IntPointer inembed, int istride, int idist,
                                        @Cast("fftwf_complex*") FloatPointer out,
                                        @Const IntPointer onembed, int ostride, int odist,
                                        int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft(int rank,
                                        @Const IntBuffer n,
                                        int batch,
                                        @Cast("fftwf_complex*") FloatBuffer in,
                                        @Const IntBuffer inembed, int istride, int idist,
                                        @Cast("fftwf_complex*") FloatBuffer out,
                                        @Const IntBuffer onembed, int ostride, int odist,
                                        int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft(int rank,
                                        @Const int[] n,
                                        int batch,
                                        @Cast("fftwf_complex*") float[] in,
                                        @Const int[] inembed, int istride, int idist,
                                        @Cast("fftwf_complex*") float[] out,
                                        @Const int[] onembed, int ostride, int odist,
                                        int sign, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_many_dft_r2c(int rank,
                                            @Const IntPointer n,
                                            int batch,
                                            FloatPointer in,
                                            @Const IntPointer inembed, int istride, int idist,
                                            @Cast("fftwf_complex*") FloatPointer out,
                                            @Const IntPointer onembed, int ostride, int odist,
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_r2c(int rank,
                                            @Const IntBuffer n,
                                            int batch,
                                            FloatBuffer in,
                                            @Const IntBuffer inembed, int istride, int idist,
                                            @Cast("fftwf_complex*") FloatBuffer out,
                                            @Const IntBuffer onembed, int ostride, int odist,
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_r2c(int rank,
                                            @Const int[] n,
                                            int batch,
                                            float[] in,
                                            @Const int[] inembed, int istride, int idist,
                                            @Cast("fftwf_complex*") float[] out,
                                            @Const int[] onembed, int ostride, int odist,
                                            @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_many_dft_c2r(int rank,
                                            @Const IntPointer n,
                                            int batch,
                                            @Cast("fftwf_complex*") FloatPointer in,
                                            @Const IntPointer inembed, int istride, int idist,
                                            FloatPointer out,
                                            @Const IntPointer onembed, int ostride, int odist,
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_c2r(int rank,
                                            @Const IntBuffer n,
                                            int batch,
                                            @Cast("fftwf_complex*") FloatBuffer in,
                                            @Const IntBuffer inembed, int istride, int idist,
                                            FloatBuffer out,
                                            @Const IntBuffer onembed, int ostride, int odist,
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_c2r(int rank,
                                            @Const int[] n,
                                            int batch,
                                            @Cast("fftwf_complex*") float[] in,
                                            @Const int[] inembed, int istride, int idist,
                                            float[] out,
                                            @Const int[] onembed, int ostride, int odist,
                                            @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru_dft(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                        int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                        @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out,
                                        int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                        int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                        @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out,
                                        int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                        int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                        @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out,
                                        int sign, @Cast("unsigned") int flags);
                                        
public static native fftwf_plan fftwf_plan_guru_dft_r2c(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                            int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                            FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, 
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_r2c(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                            int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                            FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, 
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_r2c(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                            int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                            float[] in, @Cast("fftwf_complex*") float[] out, 
                                            @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru_dft_c2r(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                            int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                            @Cast("fftwf_complex*") FloatPointer in, FloatPointer out, 
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_c2r(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                            int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                            @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out, 
                                            @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_c2r(int rank, @Cast("const fftwf_iodim*") fftw_iodim dims,
                                            int batch_rank, @Cast("const fftwf_iodim*") fftw_iodim batch_dims,
                                            @Cast("fftwf_complex*") float[] in, float[] out, 
                                            @Cast("unsigned") int flags);

public static native void fftwf_execute(fftw_plan plan);

public static native void fftwf_execute_dft(fftwf_plan plan, 
                                @Cast("fftwf_complex*") FloatPointer idata,
                                @Cast("fftwf_complex*") FloatPointer odata);
public static native void fftwf_execute_dft(fftwf_plan plan, 
                                @Cast("fftwf_complex*") FloatBuffer idata,
                                @Cast("fftwf_complex*") FloatBuffer odata);
public static native void fftwf_execute_dft(fftwf_plan plan, 
                                @Cast("fftwf_complex*") float[] idata,
                                @Cast("fftwf_complex*") float[] odata);

public static native void fftwf_execute_dft_r2c(fftwf_plan plan, 
                                    FloatPointer idata,
                                    @Cast("fftwf_complex*") FloatPointer odata);
public static native void fftwf_execute_dft_r2c(fftwf_plan plan, 
                                    FloatBuffer idata,
                                    @Cast("fftwf_complex*") FloatBuffer odata);
public static native void fftwf_execute_dft_r2c(fftwf_plan plan, 
                                    float[] idata,
                                    @Cast("fftwf_complex*") float[] odata);

public static native void fftwf_execute_dft_c2r(fftwf_plan plan, 
                                    @Cast("fftwf_complex*") FloatPointer idata,
                                    FloatPointer odata);
public static native void fftwf_execute_dft_c2r(fftwf_plan plan, 
                                    @Cast("fftwf_complex*") FloatBuffer idata,
                                    FloatBuffer odata);
public static native void fftwf_execute_dft_c2r(fftwf_plan plan, 
                                    @Cast("fftwf_complex*") float[] idata,
                                    float[] odata);
                                   

// CUFFTW defines and supports the following support APIs

public static native Pointer fftw_malloc(@Cast("size_t") long n);

public static native Pointer fftwf_malloc(@Cast("size_t") long n);

public static native void fftw_free(Pointer pointer);

public static native void fftwf_free(Pointer pointer);

public static native void fftw_export_wisdom_to_file(@Cast("FILE*") Pointer output_file); 

public static native void fftwf_export_wisdom_to_file(@Cast("FILE*") Pointer output_file); 

public static native void fftw_import_wisdom_from_file(@Cast("FILE*") Pointer input_file); 

public static native void fftwf_import_wisdom_from_file(@Cast("FILE*") Pointer input_file); 

public static native void fftw_print_plan(fftw_plan plan);                                 

public static native void fftwf_print_plan(fftwf_plan plan); 

public static native void fftw_set_timelimit(double seconds);

public static native void fftwf_set_timelimit(double seconds);

public static native double fftw_cost(fftw_plan plan);
                               
public static native double fftwf_cost(fftw_plan plan);

public static native void fftw_flops(fftw_plan plan, DoublePointer add, DoublePointer mul, DoublePointer fma);
public static native void fftw_flops(fftw_plan plan, DoubleBuffer add, DoubleBuffer mul, DoubleBuffer fma);
public static native void fftw_flops(fftw_plan plan, double[] add, double[] mul, double[] fma);

public static native void fftwf_flops(fftw_plan plan, DoublePointer add, DoublePointer mul, DoublePointer fma);
public static native void fftwf_flops(fftw_plan plan, DoubleBuffer add, DoubleBuffer mul, DoubleBuffer fma);
public static native void fftwf_flops(fftw_plan plan, double[] add, double[] mul, double[] fma);

public static native void fftw_destroy_plan(fftw_plan plan);

public static native void fftwf_destroy_plan(fftwf_plan plan);

public static native void fftw_cleanup();

public static native void fftwf_cleanup();

// #ifdef __cplusplus
// #endif

// #endif /* _CUFFTW_H_ */


}
