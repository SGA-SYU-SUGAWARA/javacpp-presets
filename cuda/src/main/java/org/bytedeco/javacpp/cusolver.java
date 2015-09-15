// Targeted by JavaCPP version 1.1-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.cuda.*;
import static org.bytedeco.javacpp.cublas.*;
import static org.bytedeco.javacpp.cusparse.*;

public class cusolver extends org.bytedeco.javacpp.presets.cusolver {
    static { Loader.load(); }

// Parsed from <cusolver_common.h>

/*
 * Copyright 2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
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
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
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

// #if !defined(CUSOLVER_COMMON_H_)
// #define CUSOLVER_COMMON_H_

/** enum cusolverStatus_t */
public static final int
    CUSOLVER_STATUS_SUCCESS= 0,
    CUSOLVER_STATUS_NOT_INITIALIZED= 1,
    CUSOLVER_STATUS_ALLOC_FAILED= 2,
    CUSOLVER_STATUS_INVALID_VALUE= 3,
    CUSOLVER_STATUS_ARCH_MISMATCH= 4,
    CUSOLVER_STATUS_MAPPING_ERROR= 5,
    CUSOLVER_STATUS_EXECUTION_FAILED= 6,
    CUSOLVER_STATUS_INTERNAL_ERROR= 7,
    CUSOLVER_STATUS_MATRIX_TYPE_NOT_SUPPORTED= 8,
    CUSOLVER_STATUS_NOT_SUPPORTED = 9,
    CUSOLVER_STATUS_ZERO_PIVOT= 10,
    CUSOLVER_STATUS_INVALID_LICENSE= 11;

// #endif // CUSOLVER_COMMON_H_





// Parsed from <cusolverDn.h>

/*
 * Copyright 2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
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
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
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
 
 /*   cuSolverDN : Dense Linear Algebra Library

 */
 
// #if !defined(CUSOLVERDN_H_)
// #define CUSOLVERDN_H_

// #ifndef CUDENSEAPI
// #ifdef _WIN32
// #define CUDENSEAPI __stdcall
// #else
// #define CUDENSEAPI 
// #endif
// #endif

// #include "driver_types.h"
// #include "cuComplex.h"   /* import complex data type */
// #include "cublas_v2.h"

// #if defined(__cplusplus)
// #endif /* __cplusplus */

// #ifndef CUSOLVER_COMMON
// #define CUSOLVER_COMMON
// #include "cusolver_common.h"
// #endif // CUSOLVER_COMMON

@Opaque public static class cusolverDnContext extends Pointer {
    /** Empty constructor. */
    public cusolverDnContext() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cusolverDnContext(Pointer p) { super(p); }
}

public static native @Cast("cusolverStatus_t") int cusolverDnCreate(@ByPtrPtr cusolverDnContext handle);
public static native @Cast("cusolverStatus_t") int cusolverDnDestroy(cusolverDnContext handle);
public static native @Cast("cusolverStatus_t") int cusolverDnSetStream(cusolverDnContext handle, CUstream_st streamId);
public static native @Cast("cusolverStatus_t") int cusolverDnGetStream(cusolverDnContext handle, @ByPtrPtr CUstream_st streamId);

/* Cholesky factorization and its solver */
public static native @Cast("cusolverStatus_t") int cusolverDnSpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    FloatPointer A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    FloatBuffer A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    float[] A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnDpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    DoublePointer A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    double[] A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnCpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnZpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntPointer Lwork);
public static native @Cast("cusolverStatus_t") int cusolverDnZpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntBuffer Lwork);
public static native @Cast("cusolverStatus_t") int cusolverDnZpotrf_bufferSize( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    int[] Lwork);

public static native @Cast("cusolverStatus_t") int cusolverDnSpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    FloatPointer A, 
    int lda,  
    FloatPointer Workspace, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    FloatBuffer A, 
    int lda,  
    FloatBuffer Workspace, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    float[] A, 
    int lda,  
    float[] Workspace, 
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnDpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    DoublePointer A, 
    int lda, 
    DoublePointer Workspace, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    DoubleBuffer Workspace, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    double[] A, 
    int lda, 
    double[] Workspace, 
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnCpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 Workspace, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 Workspace, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 Workspace, 
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnZpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZpotrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    int Lwork, 
    int[] devInfo );


public static native @Cast("cusolverStatus_t") int cusolverDnSpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Const FloatPointer A,
    int lda,
    FloatPointer B,
    int ldb,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnSpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Const FloatBuffer A,
    int lda,
    FloatBuffer B,
    int ldb,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnSpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Const float[] A,
    int lda,
    float[] B,
    int ldb,
    int[] devInfo);

public static native @Cast("cusolverStatus_t") int cusolverDnDpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Const DoublePointer A,
    int lda,
    DoublePointer B,
    int ldb,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnDpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Const DoubleBuffer A,
    int lda,
    DoubleBuffer B,
    int ldb,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnDpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Const double[] A,
    int lda,
    double[] B,
    int ldb,
    int[] devInfo);

public static native @Cast("cusolverStatus_t") int cusolverDnCpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Cast("const cuComplex*") float2 A,
    int lda,
    @Cast("cuComplex*") float2 B,
    int ldb,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnCpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Cast("const cuComplex*") float2 A,
    int lda,
    @Cast("cuComplex*") float2 B,
    int ldb,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnCpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Cast("const cuComplex*") float2 A,
    int lda,
    @Cast("cuComplex*") float2 B,
    int ldb,
    int[] devInfo);

public static native @Cast("cusolverStatus_t") int cusolverDnZpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Cast("const cuDoubleComplex*") double2 A,
    int lda,
    @Cast("cuDoubleComplex*") double2 B,
    int ldb,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnZpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Cast("const cuDoubleComplex*") double2 A,
    int lda,
    @Cast("cuDoubleComplex*") double2 B,
    int ldb,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnZpotrs(
    cusolverDnContext handle,
    @Cast("cublasFillMode_t") int uplo,
    int n,
    int nrhs,
    @Cast("const cuDoubleComplex*") double2 A,
    int lda,
    @Cast("cuDoubleComplex*") double2 B,
    int ldb,
    int[] devInfo);


/* LU Factorization */
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    FloatPointer A,
    int lda,
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    FloatBuffer A,
    int lda,
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    float[] A,
    int lda,
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnDgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    DoublePointer A,
    int lda,
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    DoubleBuffer A,
    int lda,
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    double[] A,
    int lda,
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnCgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    @Cast("cuComplex*") float2 A,
    int lda,
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    @Cast("cuComplex*") float2 A,
    int lda,
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    @Cast("cuComplex*") float2 A,
    int lda,
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnZgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    @Cast("cuDoubleComplex*") double2 A,
    int lda,
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    @Cast("cuDoubleComplex*") double2 A,
    int lda,
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgetrf_bufferSize(
    cusolverDnContext handle,
    int m,
    int n,
    @Cast("cuDoubleComplex*") double2 A,
    int lda,
    int[] Lwork );


public static native @Cast("cusolverStatus_t") int cusolverDnSgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatPointer A, 
    int lda, 
    FloatPointer Workspace, 
    IntPointer devIpiv, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatBuffer A, 
    int lda, 
    FloatBuffer Workspace, 
    IntBuffer devIpiv, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    float[] A, 
    int lda, 
    float[] Workspace, 
    int[] devIpiv, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnDgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoublePointer A, 
    int lda, 
    DoublePointer Workspace, 
    IntPointer devIpiv, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    DoubleBuffer Workspace, 
    IntBuffer devIpiv, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    double[] A, 
    int lda, 
    double[] Workspace, 
    int[] devIpiv, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnCgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 Workspace, 
    IntPointer devIpiv, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 Workspace, 
    IntBuffer devIpiv, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 Workspace, 
    int[] devIpiv, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnZgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    IntPointer devIpiv, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    IntBuffer devIpiv, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgetrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    int[] devIpiv, 
    int[] devInfo );

/* Row pivoting */
public static native @Cast("cusolverStatus_t") int cusolverDnSlaswp( 
    cusolverDnContext handle, 
    int n, 
    FloatPointer A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntPointer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnSlaswp( 
    cusolverDnContext handle, 
    int n, 
    FloatBuffer A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntBuffer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnSlaswp( 
    cusolverDnContext handle, 
    int n, 
    float[] A, 
    int lda, 
    int k1, 
    int k2, 
    @Const int[] devIpiv, 
    int incx);

public static native @Cast("cusolverStatus_t") int cusolverDnDlaswp( 
    cusolverDnContext handle, 
    int n, 
    DoublePointer A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntPointer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnDlaswp( 
    cusolverDnContext handle, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntBuffer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnDlaswp( 
    cusolverDnContext handle, 
    int n, 
    double[] A, 
    int lda, 
    int k1, 
    int k2, 
    @Const int[] devIpiv, 
    int incx);

public static native @Cast("cusolverStatus_t") int cusolverDnClaswp( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntPointer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnClaswp( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntBuffer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnClaswp( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    int k1, 
    int k2, 
    @Const int[] devIpiv, 
    int incx);

public static native @Cast("cusolverStatus_t") int cusolverDnZlaswp( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntPointer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnZlaswp( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    int k1, 
    int k2, 
    @Const IntBuffer devIpiv, 
    int incx);
public static native @Cast("cusolverStatus_t") int cusolverDnZlaswp( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    int k1, 
    int k2, 
    @Const int[] devIpiv, 
    int incx);

/* LU solve */
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Const FloatPointer A, 
    int lda, 
    @Const IntPointer devIpiv, 
    FloatPointer B, 
    int ldb, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Const FloatBuffer A, 
    int lda, 
    @Const IntBuffer devIpiv, 
    FloatBuffer B, 
    int ldb, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Const float[] A, 
    int lda, 
    @Const int[] devIpiv, 
    float[] B, 
    int ldb, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnDgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Const DoublePointer A, 
    int lda, 
    @Const IntPointer devIpiv, 
    DoublePointer B, 
    int ldb, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Const DoubleBuffer A, 
    int lda, 
    @Const IntBuffer devIpiv, 
    DoubleBuffer B, 
    int ldb, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Const double[] A, 
    int lda, 
    @Const int[] devIpiv, 
    double[] B, 
    int ldb, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnCgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Cast("const cuComplex*") float2 A, 
    int lda, 
    @Const IntPointer devIpiv, 
    @Cast("cuComplex*") float2 B, 
    int ldb, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Cast("const cuComplex*") float2 A, 
    int lda, 
    @Const IntBuffer devIpiv, 
    @Cast("cuComplex*") float2 B, 
    int ldb, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Cast("const cuComplex*") float2 A, 
    int lda, 
    @Const int[] devIpiv, 
    @Cast("cuComplex*") float2 B, 
    int ldb, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnZgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Cast("const cuDoubleComplex*") double2 A, 
    int lda, 
    @Const IntPointer devIpiv, 
    @Cast("cuDoubleComplex*") double2 B, 
    int ldb, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Cast("const cuDoubleComplex*") double2 A, 
    int lda, 
    @Const IntBuffer devIpiv, 
    @Cast("cuDoubleComplex*") double2 B, 
    int ldb, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgetrs( 
    cusolverDnContext handle, 
    @Cast("cublasOperation_t") int trans, 
    int n, 
    int nrhs, 
    @Cast("const cuDoubleComplex*") double2 A, 
    int lda, 
    @Const int[] devIpiv, 
    @Cast("cuDoubleComplex*") double2 B, 
    int ldb, 
    int[] devInfo );

/* QR factorization */
public static native @Cast("cusolverStatus_t") int cusolverDnSgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatPointer A,  
    int lda, 
    FloatPointer TAU,  
    FloatPointer Workspace,  
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatBuffer A,  
    int lda, 
    FloatBuffer TAU,  
    FloatBuffer Workspace,  
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    float[] A,  
    int lda, 
    float[] TAU,  
    float[] Workspace,  
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnDgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoublePointer A, 
    int lda, 
    DoublePointer TAU, 
    DoublePointer Workspace, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    DoubleBuffer TAU, 
    DoubleBuffer Workspace, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    double[] A, 
    int lda, 
    double[] TAU, 
    double[] Workspace, 
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnCgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 TAU, 
    @Cast("cuComplex*") float2 Workspace, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 TAU, 
    @Cast("cuComplex*") float2 Workspace, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    @Cast("cuComplex*") float2 TAU, 
    @Cast("cuComplex*") float2 Workspace, 
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnZgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 TAU, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 TAU, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgeqrf( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    @Cast("cuDoubleComplex*") double2 TAU, 
    @Cast("cuDoubleComplex*") double2 Workspace, 
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnSormqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Const FloatPointer A,
    int lda,
    @Const FloatPointer tau,
    FloatPointer C,
    int ldc,
    FloatPointer work,
    int lwork,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnSormqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Const FloatBuffer A,
    int lda,
    @Const FloatBuffer tau,
    FloatBuffer C,
    int ldc,
    FloatBuffer work,
    int lwork,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnSormqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Const float[] A,
    int lda,
    @Const float[] tau,
    float[] C,
    int ldc,
    float[] work,
    int lwork,
    int[] devInfo);

public static native @Cast("cusolverStatus_t") int cusolverDnDormqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Const DoublePointer A,
    int lda,
    @Const DoublePointer tau,
    DoublePointer C,
    int ldc,
    DoublePointer work,
    int lwork,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnDormqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Const DoubleBuffer A,
    int lda,
    @Const DoubleBuffer tau,
    DoubleBuffer C,
    int ldc,
    DoubleBuffer work,
    int lwork,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnDormqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Const double[] A,
    int lda,
    @Const double[] tau,
    double[] C,
    int ldc,
    double[] work,
    int lwork,
    int[] devInfo);

public static native @Cast("cusolverStatus_t") int cusolverDnCunmqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Cast("const cuComplex*") float2 A,
    int lda,
    @Cast("const cuComplex*") float2 tau,
    @Cast("cuComplex*") float2 C,
    int ldc,
    @Cast("cuComplex*") float2 work,
    int lwork,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnCunmqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Cast("const cuComplex*") float2 A,
    int lda,
    @Cast("const cuComplex*") float2 tau,
    @Cast("cuComplex*") float2 C,
    int ldc,
    @Cast("cuComplex*") float2 work,
    int lwork,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnCunmqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Cast("const cuComplex*") float2 A,
    int lda,
    @Cast("const cuComplex*") float2 tau,
    @Cast("cuComplex*") float2 C,
    int ldc,
    @Cast("cuComplex*") float2 work,
    int lwork,
    int[] devInfo);

public static native @Cast("cusolverStatus_t") int cusolverDnZunmqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Cast("const cuDoubleComplex*") double2 A,
    int lda,
    @Cast("const cuDoubleComplex*") double2 tau,
    @Cast("cuDoubleComplex*") double2 C,
    int ldc,
    @Cast("cuDoubleComplex*") double2 work,
    int lwork,
    IntPointer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnZunmqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Cast("const cuDoubleComplex*") double2 A,
    int lda,
    @Cast("const cuDoubleComplex*") double2 tau,
    @Cast("cuDoubleComplex*") double2 C,
    int ldc,
    @Cast("cuDoubleComplex*") double2 work,
    int lwork,
    IntBuffer devInfo);
public static native @Cast("cusolverStatus_t") int cusolverDnZunmqr(
    cusolverDnContext handle,
    @Cast("cublasSideMode_t") int side,
    @Cast("cublasOperation_t") int trans,
    int m,
    int n,
    int k,
    @Cast("const cuDoubleComplex*") double2 A,
    int lda,
    @Cast("const cuDoubleComplex*") double2 tau,
    @Cast("cuDoubleComplex*") double2 C,
    int ldc,
    @Cast("cuDoubleComplex*") double2 work,
    int lwork,
    int[] devInfo);


/* QR factorization workspace query */
public static native @Cast("cusolverStatus_t") int cusolverDnSgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatPointer A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatBuffer A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    float[] A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnDgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoublePointer A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    double[] A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnCgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnZgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgeqrf_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    int[] Lwork );


/* bidiagonal */
public static native @Cast("cusolverStatus_t") int cusolverDnSgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatPointer A,  
    int lda,
    FloatPointer D, 
    FloatPointer E, 
    FloatPointer TAUQ,  
    FloatPointer TAUP, 
    FloatPointer Work,
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    FloatBuffer A,  
    int lda,
    FloatBuffer D, 
    FloatBuffer E, 
    FloatBuffer TAUQ,  
    FloatBuffer TAUP, 
    FloatBuffer Work,
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    float[] A,  
    int lda,
    float[] D, 
    float[] E, 
    float[] TAUQ,  
    float[] TAUP, 
    float[] Work,
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnDgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoublePointer A, 
    int lda,
    DoublePointer D, 
    DoublePointer E, 
    DoublePointer TAUQ, 
    DoublePointer TAUP, 
    DoublePointer Work,
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    DoubleBuffer A, 
    int lda,
    DoubleBuffer D, 
    DoubleBuffer E, 
    DoubleBuffer TAUQ, 
    DoubleBuffer TAUP, 
    DoubleBuffer Work,
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    double[] A, 
    int lda,
    double[] D, 
    double[] E, 
    double[] TAUQ, 
    double[] TAUP, 
    double[] Work,
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnCgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    FloatPointer D, 
    FloatPointer E, 
    @Cast("cuComplex*") float2 TAUQ, 
    @Cast("cuComplex*") float2 TAUP,
    @Cast("cuComplex*") float2 Work, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    FloatBuffer D, 
    FloatBuffer E, 
    @Cast("cuComplex*") float2 TAUQ, 
    @Cast("cuComplex*") float2 TAUP,
    @Cast("cuComplex*") float2 Work, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    float[] D, 
    float[] E, 
    @Cast("cuComplex*") float2 TAUQ, 
    @Cast("cuComplex*") float2 TAUP,
    @Cast("cuComplex*") float2 Work, 
    int Lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnZgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A,
    int lda, 
    DoublePointer D, 
    DoublePointer E, 
    @Cast("cuDoubleComplex*") double2 TAUQ,
    @Cast("cuDoubleComplex*") double2 TAUP, 
    @Cast("cuDoubleComplex*") double2 Work, 
    int Lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A,
    int lda, 
    DoubleBuffer D, 
    DoubleBuffer E, 
    @Cast("cuDoubleComplex*") double2 TAUQ,
    @Cast("cuDoubleComplex*") double2 TAUP, 
    @Cast("cuDoubleComplex*") double2 Work, 
    int Lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgebrd( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A,
    int lda, 
    double[] D, 
    double[] E, 
    @Cast("cuDoubleComplex*") double2 TAUQ,
    @Cast("cuDoubleComplex*") double2 TAUP, 
    @Cast("cuDoubleComplex*") double2 Work, 
    int Lwork, 
    int[] devInfo );


public static native @Cast("cusolverStatus_t") int cusolverDnSsytrd(
    cusolverDnContext handle, 
    byte uplo, 
    int n, 
    FloatPointer A, 
    int lda, 
    FloatPointer D, 
    FloatPointer E, 
    FloatPointer tau, 
    FloatPointer Work, 
    int Lwork, 
    IntPointer info);
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrd(
    cusolverDnContext handle, 
    byte uplo, 
    int n, 
    FloatBuffer A, 
    int lda, 
    FloatBuffer D, 
    FloatBuffer E, 
    FloatBuffer tau, 
    FloatBuffer Work, 
    int Lwork, 
    IntBuffer info);
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrd(
    cusolverDnContext handle, 
    byte uplo, 
    int n, 
    float[] A, 
    int lda, 
    float[] D, 
    float[] E, 
    float[] tau, 
    float[] Work, 
    int Lwork, 
    int[] info);

public static native @Cast("cusolverStatus_t") int cusolverDnDsytrd(
    cusolverDnContext handle, 
    byte uplo, 
    int n, 
    DoublePointer A, 
    int lda, 
    DoublePointer D, 
    DoublePointer E, 
    DoublePointer tau, 
    DoublePointer Work, 
    int Lwork, 
    IntPointer info);
public static native @Cast("cusolverStatus_t") int cusolverDnDsytrd(
    cusolverDnContext handle, 
    byte uplo, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    DoubleBuffer D, 
    DoubleBuffer E, 
    DoubleBuffer tau, 
    DoubleBuffer Work, 
    int Lwork, 
    IntBuffer info);
public static native @Cast("cusolverStatus_t") int cusolverDnDsytrd(
    cusolverDnContext handle, 
    byte uplo, 
    int n, 
    double[] A, 
    int lda, 
    double[] D, 
    double[] E, 
    double[] tau, 
    double[] Work, 
    int Lwork, 
    int[] info);

/* bidiagonal factorization workspace query */
public static native @Cast("cusolverStatus_t") int cusolverDnSgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnDgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnCgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnZgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgebrd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

/* singular value decomposition, A = U * Sigma * V^H */
public static native @Cast("cusolverStatus_t") int cusolverDnSgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnDgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnCgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnZgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZgesvd_bufferSize( 
    cusolverDnContext handle, 
    int m, 
    int n, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnSgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    FloatPointer A, 
    int lda, 
    FloatPointer S, 
    FloatPointer U, 
    int ldu, 
    FloatPointer VT, 
    int ldvt, 
    FloatPointer Work, 
    int Lwork, 
    FloatPointer rwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    FloatBuffer A, 
    int lda, 
    FloatBuffer S, 
    FloatBuffer U, 
    int ldu, 
    FloatBuffer VT, 
    int ldvt, 
    FloatBuffer Work, 
    int Lwork, 
    FloatBuffer rwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    float[] A, 
    int lda, 
    float[] S, 
    float[] U, 
    int ldu, 
    float[] VT, 
    int ldvt, 
    float[] Work, 
    int Lwork, 
    float[] rwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnDgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    DoublePointer A, 
    int lda, 
    DoublePointer S, 
    DoublePointer U, 
    int ldu, 
    DoublePointer VT, 
    int ldvt, 
    DoublePointer Work,
    int Lwork, 
    DoublePointer rwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    DoubleBuffer S, 
    DoubleBuffer U, 
    int ldu, 
    DoubleBuffer VT, 
    int ldvt, 
    DoubleBuffer Work,
    int Lwork, 
    DoubleBuffer rwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    double[] A, 
    int lda, 
    double[] S, 
    double[] U, 
    int ldu, 
    double[] VT, 
    int ldvt, 
    double[] Work,
    int Lwork, 
    double[] rwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnCgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A,
    int lda, 
    FloatPointer S, 
    @Cast("cuComplex*") float2 U, 
    int ldu, 
    @Cast("cuComplex*") float2 VT, 
    int ldvt,
    @Cast("cuComplex*") float2 Work, 
    int Lwork, 
    FloatPointer rwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A,
    int lda, 
    FloatBuffer S, 
    @Cast("cuComplex*") float2 U, 
    int ldu, 
    @Cast("cuComplex*") float2 VT, 
    int ldvt,
    @Cast("cuComplex*") float2 Work, 
    int Lwork, 
    FloatBuffer rwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    @Cast("cuComplex*") float2 A,
    int lda, 
    float[] S, 
    @Cast("cuComplex*") float2 U, 
    int ldu, 
    @Cast("cuComplex*") float2 VT, 
    int ldvt,
    @Cast("cuComplex*") float2 Work, 
    int Lwork, 
    float[] rwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnZgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    DoublePointer S, 
    @Cast("cuDoubleComplex*") double2 U, 
    int ldu, 
    @Cast("cuDoubleComplex*") double2 VT, 
    int ldvt, 
    @Cast("cuDoubleComplex*") double2 Work, 
    int Lwork, 
    DoublePointer rwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    DoubleBuffer S, 
    @Cast("cuDoubleComplex*") double2 U, 
    int ldu, 
    @Cast("cuDoubleComplex*") double2 VT, 
    int ldvt, 
    @Cast("cuDoubleComplex*") double2 Work, 
    int Lwork, 
    DoubleBuffer rwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZgesvd(
    cusolverDnContext handle, 
    byte jobu, 
    byte jobvt, 
    int m, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    double[] S, 
    @Cast("cuDoubleComplex*") double2 U, 
    int ldu, 
    @Cast("cuDoubleComplex*") double2 VT, 
    int ldvt, 
    @Cast("cuDoubleComplex*") double2 Work, 
    int Lwork, 
    double[] rwork, 
    int[] devInfo );

/* LDLT,UDUT factorization */
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    FloatPointer A, 
    int lda, 
    IntPointer ipiv, 
    FloatPointer work, 
    int lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    FloatBuffer A, 
    int lda, 
    IntBuffer ipiv, 
    FloatBuffer work, 
    int lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    float[] A, 
    int lda, 
    int[] ipiv, 
    float[] work, 
    int lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnDsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    DoublePointer A, 
    int lda, 
    IntPointer ipiv, 
    DoublePointer work, 
    int lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    IntBuffer ipiv, 
    DoubleBuffer work, 
    int lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnDsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    double[] A, 
    int lda, 
    int[] ipiv, 
    double[] work, 
    int lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnCsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntPointer ipiv, 
    @Cast("cuComplex*") float2 work, 
    int lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntBuffer ipiv, 
    @Cast("cuComplex*") float2 work, 
    int lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnCsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    int[] ipiv, 
    @Cast("cuComplex*") float2 work, 
    int lwork, 
    int[] devInfo );

public static native @Cast("cusolverStatus_t") int cusolverDnZsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntPointer ipiv, 
    @Cast("cuDoubleComplex*") double2 work, 
    int lwork, 
    IntPointer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntBuffer ipiv, 
    @Cast("cuDoubleComplex*") double2 work, 
    int lwork, 
    IntBuffer devInfo );
public static native @Cast("cusolverStatus_t") int cusolverDnZsytrf( 
    cusolverDnContext handle, 
    @Cast("cublasFillMode_t") int uplo, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    int[] ipiv, 
    @Cast("cuDoubleComplex*") double2 work, 
    int lwork, 
    int[] devInfo );

/* SYTRF factorization workspace query */
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    FloatPointer A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    FloatBuffer A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnSsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    float[] A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnDsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    DoublePointer A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    DoubleBuffer A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnDsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    double[] A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnCsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnCsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuComplex*") float2 A, 
    int lda, 
    int[] Lwork );

public static native @Cast("cusolverStatus_t") int cusolverDnZsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntPointer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    IntBuffer Lwork );
public static native @Cast("cusolverStatus_t") int cusolverDnZsytrf_bufferSize( 
    cusolverDnContext handle, 
    int n, 
    @Cast("cuDoubleComplex*") double2 A, 
    int lda, 
    int[] Lwork );

// #if defined(__cplusplus)
// #endif /* __cplusplus */


// #endif /* !defined(CUDENSE_H_) */


// Parsed from <cusolverRf.h>

/*
 * Copyright 1993-2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
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
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
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

// #if !defined(CUSOLVERRF_H_)
// #define CUSOLVERRF_H_

// #ifndef CRFWINAPI
// #ifdef _WIN32
// #define CRFWINAPI __stdcall
// #else
// #define CRFWINAPI 
// #endif
// #endif

// #include "driver_types.h"
// #include "cuComplex.h"   

// #if defined(__cplusplus)
// #endif /* __cplusplus */

// #include "cusolver_common.h"

/* CUSOLVERRF mode */
/** enum cusolverRfResetValuesFastMode_t */
public static final int 
    CUSOLVERRF_RESET_VALUES_FAST_MODE_OFF = 0, //default   
    CUSOLVERRF_RESET_VALUES_FAST_MODE_ON = 1;

/* CUSOLVERRF matrix format */
/** enum cusolverRfMatrixFormat_t */
public static final int 
    CUSOLVERRF_MATRIX_FORMAT_CSR = 0, //default   
    CUSOLVERRF_MATRIX_FORMAT_CSC = 1;

/* CUSOLVERRF unit diagonal */
/** enum cusolverRfUnitDiagonal_t */
public static final int 
    CUSOLVERRF_UNIT_DIAGONAL_STORED_L = 0, //default   
    CUSOLVERRF_UNIT_DIAGONAL_STORED_U = 1, 
    CUSOLVERRF_UNIT_DIAGONAL_ASSUMED_L = 2,        
    CUSOLVERRF_UNIT_DIAGONAL_ASSUMED_U = 3;

/* CUSOLVERRF factorization algorithm */
/** enum cusolverRfFactorization_t */
public static final int
    CUSOLVERRF_FACTORIZATION_ALG0 = 0, // default
    CUSOLVERRF_FACTORIZATION_ALG1 = 1,
    CUSOLVERRF_FACTORIZATION_ALG2 = 2;

/* CUSOLVERRF triangular solve algorithm */
/** enum cusolverRfTriangularSolve_t */
public static final int
    CUSOLVERRF_TRIANGULAR_SOLVE_ALG0 = 0, 
    CUSOLVERRF_TRIANGULAR_SOLVE_ALG1 = 1, // default
    CUSOLVERRF_TRIANGULAR_SOLVE_ALG2 = 2,
    CUSOLVERRF_TRIANGULAR_SOLVE_ALG3 = 3;

/* CUSOLVERRF numeric boost report */
/** enum cusolverRfNumericBoostReport_t */
public static final int
    CUSOLVERRF_NUMERIC_BOOST_NOT_USED = 0, //default
    CUSOLVERRF_NUMERIC_BOOST_USED = 1;

/* Opaque structure holding CUSOLVERRF library common */
@Opaque public static class cusolverRfCommon extends Pointer {
    /** Empty constructor. */
    public cusolverRfCommon() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cusolverRfCommon(Pointer p) { super(p); }
}

/* CUSOLVERRF create (allocate memory) and destroy (free memory) in the handle */
public static native @Cast("cusolverStatus_t") int cusolverRfCreate(@ByPtrPtr cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfDestroy(cusolverRfCommon handle);

/* CUSOLVERRF set and get input format */
public static native @Cast("cusolverStatus_t") int cusolverRfGetMatrixFormat(cusolverRfCommon handle, 
                                                       @Cast("cusolverRfMatrixFormat_t*") IntPointer format, 
                                                       @Cast("cusolverRfUnitDiagonal_t*") IntPointer diag);
public static native @Cast("cusolverStatus_t") int cusolverRfGetMatrixFormat(cusolverRfCommon handle, 
                                                       @Cast("cusolverRfMatrixFormat_t*") IntBuffer format, 
                                                       @Cast("cusolverRfUnitDiagonal_t*") IntBuffer diag);
public static native @Cast("cusolverStatus_t") int cusolverRfGetMatrixFormat(cusolverRfCommon handle, 
                                                       @Cast("cusolverRfMatrixFormat_t*") int[] format, 
                                                       @Cast("cusolverRfUnitDiagonal_t*") int[] diag);

public static native @Cast("cusolverStatus_t") int cusolverRfSetMatrixFormat(cusolverRfCommon handle, 
                                                       @Cast("cusolverRfMatrixFormat_t") int format, 
                                                       @Cast("cusolverRfUnitDiagonal_t") int diag);
    
/* CUSOLVERRF set and get numeric properties */
public static native @Cast("cusolverStatus_t") int cusolverRfSetNumericProperties(cusolverRfCommon handle, 
                                                            double zero,
                                                            double boost);
											 
public static native @Cast("cusolverStatus_t") int cusolverRfGetNumericProperties(cusolverRfCommon handle, 
                                                            DoublePointer zero,
                                                            DoublePointer boost);
public static native @Cast("cusolverStatus_t") int cusolverRfGetNumericProperties(cusolverRfCommon handle, 
                                                            DoubleBuffer zero,
                                                            DoubleBuffer boost);
public static native @Cast("cusolverStatus_t") int cusolverRfGetNumericProperties(cusolverRfCommon handle, 
                                                            double[] zero,
                                                            double[] boost);
											 
public static native @Cast("cusolverStatus_t") int cusolverRfGetNumericBoostReport(cusolverRfCommon handle, 
                                                             @Cast("cusolverRfNumericBoostReport_t*") IntPointer report);
public static native @Cast("cusolverStatus_t") int cusolverRfGetNumericBoostReport(cusolverRfCommon handle, 
                                                             @Cast("cusolverRfNumericBoostReport_t*") IntBuffer report);
public static native @Cast("cusolverStatus_t") int cusolverRfGetNumericBoostReport(cusolverRfCommon handle, 
                                                             @Cast("cusolverRfNumericBoostReport_t*") int[] report);

/* CUSOLVERRF choose the triangular solve algorithm */
public static native @Cast("cusolverStatus_t") int cusolverRfSetAlgs(cusolverRfCommon handle,
                                               @Cast("cusolverRfFactorization_t") int factAlg,
                                               @Cast("cusolverRfTriangularSolve_t") int solveAlg);

public static native @Cast("cusolverStatus_t") int cusolverRfGetAlgs(cusolverRfCommon handle, 
                                               @Cast("cusolverRfFactorization_t*") IntPointer factAlg,
                                               @Cast("cusolverRfTriangularSolve_t*") IntPointer solveAlg);
public static native @Cast("cusolverStatus_t") int cusolverRfGetAlgs(cusolverRfCommon handle, 
                                               @Cast("cusolverRfFactorization_t*") IntBuffer factAlg,
                                               @Cast("cusolverRfTriangularSolve_t*") IntBuffer solveAlg);
public static native @Cast("cusolverStatus_t") int cusolverRfGetAlgs(cusolverRfCommon handle, 
                                               @Cast("cusolverRfFactorization_t*") int[] factAlg,
                                               @Cast("cusolverRfTriangularSolve_t*") int[] solveAlg);

/* CUSOLVERRF set and get fast mode */
public static native @Cast("cusolverStatus_t") int cusolverRfGetResetValuesFastMode(cusolverRfCommon handle, 
                                                              @Cast("cusolverRfResetValuesFastMode_t*") IntPointer fastMode);
public static native @Cast("cusolverStatus_t") int cusolverRfGetResetValuesFastMode(cusolverRfCommon handle, 
                                                              @Cast("cusolverRfResetValuesFastMode_t*") IntBuffer fastMode);
public static native @Cast("cusolverStatus_t") int cusolverRfGetResetValuesFastMode(cusolverRfCommon handle, 
                                                              @Cast("cusolverRfResetValuesFastMode_t*") int[] fastMode);

public static native @Cast("cusolverStatus_t") int cusolverRfSetResetValuesFastMode(cusolverRfCommon handle, 
                                                              @Cast("cusolverRfResetValuesFastMode_t") int fastMode);

/*** Non-Batched Routines ***/
/* CUSOLVERRF setup of internal structures from host or device memory */
public static native @Cast("cusolverStatus_t") int cusolverRfSetupHost(
                                                 int n,
                                                 int nnzA,
                                                 IntPointer h_csrRowPtrA,
                                                 IntPointer h_csrColIndA,
                                                 DoublePointer h_csrValA,
                                                 int nnzL,
                                                 IntPointer h_csrRowPtrL,
                                                 IntPointer h_csrColIndL,
                                                 DoublePointer h_csrValL,
                                                 int nnzU,
                                                 IntPointer h_csrRowPtrU,
                                                 IntPointer h_csrColIndU,
                                                 DoublePointer h_csrValU,
                                                 IntPointer h_P,
                                                 IntPointer h_Q,
                                                 cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfSetupHost(
                                                 int n,
                                                 int nnzA,
                                                 IntBuffer h_csrRowPtrA,
                                                 IntBuffer h_csrColIndA,
                                                 DoubleBuffer h_csrValA,
                                                 int nnzL,
                                                 IntBuffer h_csrRowPtrL,
                                                 IntBuffer h_csrColIndL,
                                                 DoubleBuffer h_csrValL,
                                                 int nnzU,
                                                 IntBuffer h_csrRowPtrU,
                                                 IntBuffer h_csrColIndU,
                                                 DoubleBuffer h_csrValU,
                                                 IntBuffer h_P,
                                                 IntBuffer h_Q,
                                                 cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfSetupHost(
                                                 int n,
                                                 int nnzA,
                                                 int[] h_csrRowPtrA,
                                                 int[] h_csrColIndA,
                                                 double[] h_csrValA,
                                                 int nnzL,
                                                 int[] h_csrRowPtrL,
                                                 int[] h_csrColIndL,
                                                 double[] h_csrValL,
                                                 int nnzU,
                                                 int[] h_csrRowPtrU,
                                                 int[] h_csrColIndU,
                                                 double[] h_csrValU,
                                                 int[] h_P,
                                                 int[] h_Q,
                                                 cusolverRfCommon handle);
    
public static native @Cast("cusolverStatus_t") int cusolverRfSetupDevice(
                                                   int n,
                                                   int nnzA,
                                                   IntPointer csrRowPtrA,
                                                   IntPointer csrColIndA,
                                                   DoublePointer csrValA,
                                                   int nnzL,
                                                   IntPointer csrRowPtrL,
                                                   IntPointer csrColIndL,
                                                   DoublePointer csrValL,
                                                   int nnzU,
                                                   IntPointer csrRowPtrU,
                                                   IntPointer csrColIndU,
                                                   DoublePointer csrValU,
                                                   IntPointer P,
                                                   IntPointer Q,
                                                   cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfSetupDevice(
                                                   int n,
                                                   int nnzA,
                                                   IntBuffer csrRowPtrA,
                                                   IntBuffer csrColIndA,
                                                   DoubleBuffer csrValA,
                                                   int nnzL,
                                                   IntBuffer csrRowPtrL,
                                                   IntBuffer csrColIndL,
                                                   DoubleBuffer csrValL,
                                                   int nnzU,
                                                   IntBuffer csrRowPtrU,
                                                   IntBuffer csrColIndU,
                                                   DoubleBuffer csrValU,
                                                   IntBuffer P,
                                                   IntBuffer Q,
                                                   cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfSetupDevice(
                                                   int n,
                                                   int nnzA,
                                                   int[] csrRowPtrA,
                                                   int[] csrColIndA,
                                                   double[] csrValA,
                                                   int nnzL,
                                                   int[] csrRowPtrL,
                                                   int[] csrColIndL,
                                                   double[] csrValL,
                                                   int nnzU,
                                                   int[] csrRowPtrU,
                                                   int[] csrColIndU,
                                                   double[] csrValU,
                                                   int[] P,
                                                   int[] Q,
                                                   cusolverRfCommon handle);

/* CUSOLVERRF update the matrix values (assuming the reordering, pivoting 
   and consequently the sparsity pattern of L and U did not change),
   and zero out the remaining values. */
public static native @Cast("cusolverStatus_t") int cusolverRfResetValues(
                                                   int n,
                                                   int nnzA,
                                                   IntPointer csrRowPtrA, 
                                                   IntPointer csrColIndA, 
                                                   DoublePointer csrValA,
                                                   IntPointer P,
                                                   IntPointer Q,
                                                   cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfResetValues(
                                                   int n,
                                                   int nnzA,
                                                   IntBuffer csrRowPtrA, 
                                                   IntBuffer csrColIndA, 
                                                   DoubleBuffer csrValA,
                                                   IntBuffer P,
                                                   IntBuffer Q,
                                                   cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfResetValues(
                                                   int n,
                                                   int nnzA,
                                                   int[] csrRowPtrA, 
                                                   int[] csrColIndA, 
                                                   double[] csrValA,
                                                   int[] P,
                                                   int[] Q,
                                                   cusolverRfCommon handle);

/* CUSOLVERRF analysis (for parallelism) */
public static native @Cast("cusolverStatus_t") int cusolverRfAnalyze(cusolverRfCommon handle);

/* CUSOLVERRF re-factorization (for parallelism) */
public static native @Cast("cusolverStatus_t") int cusolverRfRefactor(cusolverRfCommon handle);

/* CUSOLVERRF extraction: Get L & U packed into a single matrix M */
public static native @Cast("cusolverStatus_t") int cusolverRfAccessBundledFactorsDevice(
                                                                  cusolverRfCommon handle,
                                                                  IntPointer nnzM,
                                                                  @Cast("int**") PointerPointer Mp, 
                                                                  @Cast("int**") PointerPointer Mi, 
                                                                  @Cast("double**") PointerPointer Mx);
public static native @Cast("cusolverStatus_t") int cusolverRfAccessBundledFactorsDevice(
                                                                  cusolverRfCommon handle,
                                                                  IntPointer nnzM,
                                                                  @ByPtrPtr IntPointer Mp, 
                                                                  @ByPtrPtr IntPointer Mi, 
                                                                  @ByPtrPtr DoublePointer Mx);
public static native @Cast("cusolverStatus_t") int cusolverRfAccessBundledFactorsDevice(
                                                                  cusolverRfCommon handle,
                                                                  IntBuffer nnzM,
                                                                  @ByPtrPtr IntBuffer Mp, 
                                                                  @ByPtrPtr IntBuffer Mi, 
                                                                  @ByPtrPtr DoubleBuffer Mx);
public static native @Cast("cusolverStatus_t") int cusolverRfAccessBundledFactorsDevice(
                                                                  cusolverRfCommon handle,
                                                                  int[] nnzM,
                                                                  @ByPtrPtr int[] Mp, 
                                                                  @ByPtrPtr int[] Mi, 
                                                                  @ByPtrPtr double[] Mx);

public static native @Cast("cusolverStatus_t") int cusolverRfExtractBundledFactorsHost(
                                                                 cusolverRfCommon handle,
                                                                 IntPointer h_nnzM,
                                                                 @Cast("int**") PointerPointer h_Mp, 
                                                                 @Cast("int**") PointerPointer h_Mi, 
                                                                 @Cast("double**") PointerPointer h_Mx);
public static native @Cast("cusolverStatus_t") int cusolverRfExtractBundledFactorsHost(
                                                                 cusolverRfCommon handle,
                                                                 IntPointer h_nnzM,
                                                                 @ByPtrPtr IntPointer h_Mp, 
                                                                 @ByPtrPtr IntPointer h_Mi, 
                                                                 @ByPtrPtr DoublePointer h_Mx);
public static native @Cast("cusolverStatus_t") int cusolverRfExtractBundledFactorsHost(
                                                                 cusolverRfCommon handle,
                                                                 IntBuffer h_nnzM,
                                                                 @ByPtrPtr IntBuffer h_Mp, 
                                                                 @ByPtrPtr IntBuffer h_Mi, 
                                                                 @ByPtrPtr DoubleBuffer h_Mx);
public static native @Cast("cusolverStatus_t") int cusolverRfExtractBundledFactorsHost(
                                                                 cusolverRfCommon handle,
                                                                 int[] h_nnzM,
                                                                 @ByPtrPtr int[] h_Mp, 
                                                                 @ByPtrPtr int[] h_Mi, 
                                                                 @ByPtrPtr double[] h_Mx);

/* CUSOLVERRF extraction: Get L & U individually */
public static native @Cast("cusolverStatus_t") int cusolverRfExtractSplitFactorsHost(
                                                               cusolverRfCommon handle,
                                                               IntPointer h_nnzL, 
                                                               @Cast("int**") PointerPointer h_csrRowPtrL, 
                                                               @Cast("int**") PointerPointer h_csrColIndL, 
                                                               @Cast("double**") PointerPointer h_csrValL, 
                                                               IntPointer h_nnzU, 
                                                               @Cast("int**") PointerPointer h_csrRowPtrU, 
                                                               @Cast("int**") PointerPointer h_csrColIndU, 
                                                               @Cast("double**") PointerPointer h_csrValU);
public static native @Cast("cusolverStatus_t") int cusolverRfExtractSplitFactorsHost(
                                                               cusolverRfCommon handle,
                                                               IntPointer h_nnzL, 
                                                               @ByPtrPtr IntPointer h_csrRowPtrL, 
                                                               @ByPtrPtr IntPointer h_csrColIndL, 
                                                               @ByPtrPtr DoublePointer h_csrValL, 
                                                               IntPointer h_nnzU, 
                                                               @ByPtrPtr IntPointer h_csrRowPtrU, 
                                                               @ByPtrPtr IntPointer h_csrColIndU, 
                                                               @ByPtrPtr DoublePointer h_csrValU);
public static native @Cast("cusolverStatus_t") int cusolverRfExtractSplitFactorsHost(
                                                               cusolverRfCommon handle,
                                                               IntBuffer h_nnzL, 
                                                               @ByPtrPtr IntBuffer h_csrRowPtrL, 
                                                               @ByPtrPtr IntBuffer h_csrColIndL, 
                                                               @ByPtrPtr DoubleBuffer h_csrValL, 
                                                               IntBuffer h_nnzU, 
                                                               @ByPtrPtr IntBuffer h_csrRowPtrU, 
                                                               @ByPtrPtr IntBuffer h_csrColIndU, 
                                                               @ByPtrPtr DoubleBuffer h_csrValU);
public static native @Cast("cusolverStatus_t") int cusolverRfExtractSplitFactorsHost(
                                                               cusolverRfCommon handle,
                                                               int[] h_nnzL, 
                                                               @ByPtrPtr int[] h_csrRowPtrL, 
                                                               @ByPtrPtr int[] h_csrColIndL, 
                                                               @ByPtrPtr double[] h_csrValL, 
                                                               int[] h_nnzU, 
                                                               @ByPtrPtr int[] h_csrRowPtrU, 
                                                               @ByPtrPtr int[] h_csrColIndU, 
                                                               @ByPtrPtr double[] h_csrValU);

/* CUSOLVERRF (forward and backward triangular) solves */
public static native @Cast("cusolverStatus_t") int cusolverRfSolve(
                                             cusolverRfCommon handle,
                                             IntPointer P,
                                             IntPointer Q,
                                             int nrhs,
                                             DoublePointer Temp,
                                             int ldt,
                                             DoublePointer XF,
                                             int ldxf);
public static native @Cast("cusolverStatus_t") int cusolverRfSolve(
                                             cusolverRfCommon handle,
                                             IntBuffer P,
                                             IntBuffer Q,
                                             int nrhs,
                                             DoubleBuffer Temp,
                                             int ldt,
                                             DoubleBuffer XF,
                                             int ldxf);
public static native @Cast("cusolverStatus_t") int cusolverRfSolve(
                                             cusolverRfCommon handle,
                                             int[] P,
                                             int[] Q,
                                             int nrhs,
                                             double[] Temp,
                                             int ldt,
                                             double[] XF,
                                             int ldxf);

/*** Batched Routines ***/
/* CUSOLVERRF-batch setup of internal structures from host */
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSetupHost(
                                                      int batchSize,
                                                      int n,
                                                      int nnzA,
                                                      IntPointer h_csrRowPtrA,
                                                      IntPointer h_csrColIndA,
                                                      @Cast("double**") PointerPointer h_csrValA_array,
                                                      int nnzL,
                                                      IntPointer h_csrRowPtrL,
                                                      IntPointer h_csrColIndL,
                                                      DoublePointer h_csrValL,
                                                      int nnzU,
                                                      IntPointer h_csrRowPtrU,
                                                      IntPointer h_csrColIndU,
                                                      DoublePointer h_csrValU,
                                                      IntPointer h_P,
                                                      IntPointer h_Q,
                                                      cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSetupHost(
                                                      int batchSize,
                                                      int n,
                                                      int nnzA,
                                                      IntPointer h_csrRowPtrA,
                                                      IntPointer h_csrColIndA,
                                                      @ByPtrPtr DoublePointer h_csrValA_array,
                                                      int nnzL,
                                                      IntPointer h_csrRowPtrL,
                                                      IntPointer h_csrColIndL,
                                                      DoublePointer h_csrValL,
                                                      int nnzU,
                                                      IntPointer h_csrRowPtrU,
                                                      IntPointer h_csrColIndU,
                                                      DoublePointer h_csrValU,
                                                      IntPointer h_P,
                                                      IntPointer h_Q,
                                                      cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSetupHost(
                                                      int batchSize,
                                                      int n,
                                                      int nnzA,
                                                      IntBuffer h_csrRowPtrA,
                                                      IntBuffer h_csrColIndA,
                                                      @ByPtrPtr DoubleBuffer h_csrValA_array,
                                                      int nnzL,
                                                      IntBuffer h_csrRowPtrL,
                                                      IntBuffer h_csrColIndL,
                                                      DoubleBuffer h_csrValL,
                                                      int nnzU,
                                                      IntBuffer h_csrRowPtrU,
                                                      IntBuffer h_csrColIndU,
                                                      DoubleBuffer h_csrValU,
                                                      IntBuffer h_P,
                                                      IntBuffer h_Q,
                                                      cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSetupHost(
                                                      int batchSize,
                                                      int n,
                                                      int nnzA,
                                                      int[] h_csrRowPtrA,
                                                      int[] h_csrColIndA,
                                                      @ByPtrPtr double[] h_csrValA_array,
                                                      int nnzL,
                                                      int[] h_csrRowPtrL,
                                                      int[] h_csrColIndL,
                                                      double[] h_csrValL,
                                                      int nnzU,
                                                      int[] h_csrRowPtrU,
                                                      int[] h_csrColIndU,
                                                      double[] h_csrValU,
                                                      int[] h_P,
                                                      int[] h_Q,
                                                      cusolverRfCommon handle);

/* CUSOLVERRF-batch update the matrix values (assuming the reordering, pivoting 
   and consequently the sparsity pattern of L and U did not change),
   and zero out the remaining values. */
public static native @Cast("cusolverStatus_t") int cusolverRfBatchResetValues(
                                                        int batchSize,
                                                        int n,
                                                        int nnzA,
                                                        IntPointer csrRowPtrA,
                                                        IntPointer csrColIndA,
                                                        @Cast("double**") PointerPointer csrValA_array,
                                                        IntPointer P,
                                                        IntPointer Q,
                                                        cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchResetValues(
                                                        int batchSize,
                                                        int n,
                                                        int nnzA,
                                                        IntPointer csrRowPtrA,
                                                        IntPointer csrColIndA,
                                                        @ByPtrPtr DoublePointer csrValA_array,
                                                        IntPointer P,
                                                        IntPointer Q,
                                                        cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchResetValues(
                                                        int batchSize,
                                                        int n,
                                                        int nnzA,
                                                        IntBuffer csrRowPtrA,
                                                        IntBuffer csrColIndA,
                                                        @ByPtrPtr DoubleBuffer csrValA_array,
                                                        IntBuffer P,
                                                        IntBuffer Q,
                                                        cusolverRfCommon handle);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchResetValues(
                                                        int batchSize,
                                                        int n,
                                                        int nnzA,
                                                        int[] csrRowPtrA,
                                                        int[] csrColIndA,
                                                        @ByPtrPtr double[] csrValA_array,
                                                        int[] P,
                                                        int[] Q,
                                                        cusolverRfCommon handle);
 
/* CUSOLVERRF-batch analysis (for parallelism) */
public static native @Cast("cusolverStatus_t") int cusolverRfBatchAnalyze(cusolverRfCommon handle);

/* CUSOLVERRF-batch re-factorization (for parallelism) */
public static native @Cast("cusolverStatus_t") int cusolverRfBatchRefactor(cusolverRfCommon handle);

/* CUSOLVERRF-batch (forward and backward triangular) solves */
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSolve(
                                                  cusolverRfCommon handle,
                                                  IntPointer P,
                                                  IntPointer Q,
                                                  int nrhs,
                                                  DoublePointer Temp,
                                                  int ldt,
                                                  @Cast("double**") PointerPointer XF_array,
                                                  int ldxf);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSolve(
                                                  cusolverRfCommon handle,
                                                  IntPointer P,
                                                  IntPointer Q,
                                                  int nrhs,
                                                  DoublePointer Temp,
                                                  int ldt,
                                                  @ByPtrPtr DoublePointer XF_array,
                                                  int ldxf);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSolve(
                                                  cusolverRfCommon handle,
                                                  IntBuffer P,
                                                  IntBuffer Q,
                                                  int nrhs,
                                                  DoubleBuffer Temp,
                                                  int ldt,
                                                  @ByPtrPtr DoubleBuffer XF_array,
                                                  int ldxf);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchSolve(
                                                  cusolverRfCommon handle,
                                                  int[] P,
                                                  int[] Q,
                                                  int nrhs,
                                                  double[] Temp,
                                                  int ldt,
                                                  @ByPtrPtr double[] XF_array,
                                                  int ldxf);

/* CUSOLVERRF-batch obtain the position of zero pivot */    
public static native @Cast("cusolverStatus_t") int cusolverRfBatchZeroPivot(
                                                      cusolverRfCommon handle,
                                                      IntPointer position);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchZeroPivot(
                                                      cusolverRfCommon handle,
                                                      IntBuffer position);
public static native @Cast("cusolverStatus_t") int cusolverRfBatchZeroPivot(
                                                      cusolverRfCommon handle,
                                                      int[] position);

// #if defined(__cplusplus)
// #endif /* __cplusplus */

// #endif /* CUSOLVERRF_H_ */


// Parsed from cusolverSp.h

/*
 * Copyright 2014 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
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
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
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

// #ifndef CUSOLVERAPI
// #ifdef _WIN32
// #define CUSOLVERAPI __stdcall
// #else
// #define CUSOLVERAPI 
// #endif
// #endif

// #if !defined(CUSOLVERSP_H_)
// #define CUSOLVERSP_H_

// #include "cusparse.h"

// #if defined(__cplusplus)
// #endif /* __cplusplus */

// #include "cusolver_common.h"

@Opaque public static class cusolverSpContext extends Pointer {
    /** Empty constructor. */
    public cusolverSpContext() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cusolverSpContext(Pointer p) { super(p); }
}

@Opaque public static class csrqrInfo extends Pointer {
    /** Empty constructor. */
    public csrqrInfo() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public csrqrInfo(Pointer p) { super(p); }
}


public static native @Cast("cusolverStatus_t") int cusolverSpCreate(@ByPtrPtr cusolverSpContext handle);
public static native @Cast("cusolverStatus_t") int cusolverSpDestroy(cusolverSpContext handle);
public static native @Cast("cusolverStatus_t") int cusolverSpSetStream(cusolverSpContext handle, CUstream_st streamId);
public static native @Cast("cusolverStatus_t") int cusolverSpGetStream(cusolverSpContext handle, @ByPtrPtr CUstream_st streamId);


public static native @Cast("cusolverStatus_t") int cusolverSpXcsrissymHost(
    cusolverSpContext handle,
    int m,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrEndPtrA,
    @Const IntPointer csrColIndA,
    IntPointer issym);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrissymHost(
    cusolverSpContext handle,
    int m,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrEndPtrA,
    @Const IntBuffer csrColIndA,
    IntBuffer issym);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrissymHost(
    cusolverSpContext handle,
    int m,
    int nnzA,
    cusparseMatDescr descrA,
    @Const int[] csrRowPtrA,
    @Const int[] csrEndPtrA,
    @Const int[] csrColIndA,
    int[] issym);

/* -------- GPU linear solver based on LU factorization
 *       solve A*x = b, A can be singular 
 * [ls] stands for linear solve
 * [v] stands for vector
 * [lu] stands for LU factorization
 */
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const FloatPointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const FloatPointer b,
    float tol, 
    int reorder,
    FloatPointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const FloatBuffer b,
    float tol, 
    int reorder,
    FloatBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const float[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const float[] b,
    float tol, 
    int reorder,
    float[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const DoublePointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const DoublePointer b,
    double tol,
    int reorder,
    DoublePointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const DoubleBuffer b,
    double tol,
    int reorder,
    DoubleBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const double[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const double[] b,
    double tol,
    int reorder,
    double[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvluHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    int[] singularity);


/* -------- GPU linear solver based on QR factorization
 *       solve A*x = b, A can be singular 
 * [ls] stands for linear solve
 * [v] stands for vector
 * [qr] stands for QR factorization
 */
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Const FloatPointer b,
    float tol,
    int reorder,
    FloatPointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Const FloatBuffer b,
    float tol,
    int reorder,
    FloatBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Const float[] b,
    float tol,
    int reorder,
    float[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Const DoublePointer b,
    double tol,
    int reorder,
    DoublePointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Const DoubleBuffer b,
    double tol,
    int reorder,
    DoubleBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Const double[] b,
    double tol,
    int reorder,
    double[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvqr(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    int[] singularity);



/* -------- CPU linear solver based on QR factorization
 *       solve A*x = b, A can be singular 
 * [ls] stands for linear solve
 * [v] stands for vector
 * [qr] stands for QR factorization
 */ 
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const FloatPointer b,
    float tol,
    int reorder,
    FloatPointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const FloatBuffer b,
    float tol,
    int reorder,
    FloatBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const float[] b,
    float tol,
    int reorder,
    float[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const DoublePointer b,
    double tol,
    int reorder,
    DoublePointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const DoubleBuffer b,
    double tol,
    int reorder,
    DoubleBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const double[] b,
    double tol,
    int reorder,
    double[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvqrHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    int[] singularity);


/* -------- CPU linear solver based on Cholesky factorization
 *       solve A*x = b, A can be singular 
 * [ls] stands for linear solve
 * [v] stands for vector
 * [chol] stands for Cholesky factorization
 *
 * Only works for symmetric positive definite matrix.
 * The upper part of A is ignored.
 */ 
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Const FloatPointer b,
    float tol,
    int reorder,
    FloatPointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Const FloatBuffer b,
    float tol,
    int reorder,
    FloatBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Const float[] b,
    float tol,
    int reorder,
    float[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Const DoublePointer b,
    double tol,
    int reorder,
    DoublePointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Const DoubleBuffer b,
    double tol,
    int reorder,
    DoubleBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Const double[] b,
    double tol,
    int reorder,
    double[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvcholHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    int[] singularity);

/* -------- GPU linear solver based on Cholesky factorization
 *       solve A*x = b, A can be singular 
 * [ls] stands for linear solve
 * [v] stands for vector
 * [chol] stands for Cholesky factorization
 *
 * Only works for symmetric positive definite matrix.
 * The upper part of A is ignored.
 */
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Const FloatPointer b,
    float tol,
    int reorder,
    FloatPointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Const FloatBuffer b,
    float tol,
    int reorder,
    FloatBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Const float[] b,
    float tol,
    int reorder,
    float[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Const DoublePointer b,
    double tol,
    int reorder,
    DoublePointer x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Const DoubleBuffer b,
    double tol,
    int reorder,
    DoubleBuffer x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Const double[] b,
    double tol,
    int reorder,
    double[] x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int reorder,
    @Cast("cuComplex*") float2 x,
    int[] singularity);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntPointer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    IntBuffer singularity);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsvchol(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int reorder,
    @Cast("cuDoubleComplex*") double2 x,
    int[] singularity);



/* ----------- CPU least square solver based on QR factorization
 *       solve min|b - A*x| 
 * [lsq] stands for least square
 * [v] stands for vector
 * [qr] stands for QR factorization
 */ 
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const FloatPointer b,
    float tol,
    IntPointer rankA,
    FloatPointer x,
    IntPointer p,
    FloatPointer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const FloatBuffer b,
    float tol,
    IntBuffer rankA,
    FloatBuffer x,
    IntBuffer p,
    FloatBuffer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const float[] b,
    float tol,
    int[] rankA,
    float[] x,
    int[] p,
    float[] min_norm);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const DoublePointer b,
    double tol,
    IntPointer rankA,
    DoublePointer x,
    IntPointer p,
    DoublePointer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const DoubleBuffer b,
    double tol,
    IntBuffer rankA,
    DoubleBuffer x,
    IntBuffer p,
    DoubleBuffer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const double[] b,
    double tol,
    int[] rankA,
    double[] x,
    int[] p,
    double[] min_norm);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    IntPointer rankA,
    @Cast("cuComplex*") float2 x,
    IntPointer p,
    FloatPointer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    IntBuffer rankA,
    @Cast("cuComplex*") float2 x,
    IntBuffer p,
    FloatBuffer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuComplex*") float2 b,
    float tol,
    int[] rankA,
    @Cast("cuComplex*") float2 x,
    int[] p,
    float[] min_norm);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    IntPointer rankA,
    @Cast("cuDoubleComplex*") double2 x,
    IntPointer p,
    DoublePointer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    IntBuffer rankA,
    @Cast("cuDoubleComplex*") double2 x,
    IntBuffer p,
    DoubleBuffer min_norm);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrlsqvqrHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,
    double tol,
    int[] rankA,
    @Cast("cuDoubleComplex*") double2 x,
    int[] p,
    double[] min_norm);

/* --------- CPU eigenvalue solver based on shift inverse
 *      solve A*x = lambda * x 
 *   where lambda is the eigenvalue nearest mu0.
 * [eig] stands for eigenvalue solver
 * [si] stands for shift-inverse
 */
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    float mu0,
    @Const FloatPointer x0,
    int maxite,
    float tol,
    FloatPointer mu,
    FloatPointer x);
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    float mu0,
    @Const FloatBuffer x0,
    int maxite,
    float tol,
    FloatBuffer mu,
    FloatBuffer x);
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    float mu0,
    @Const float[] x0,
    int maxite,
    float tol,
    float[] mu,
    float[] x);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    double mu0,
    @Const DoublePointer x0,
    int maxite,
    double tol,
    DoublePointer mu,
    DoublePointer x);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    double mu0,
    @Const DoubleBuffer x0,
    int maxite,
    double tol,
    DoubleBuffer mu,
    DoubleBuffer x);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    double mu0,
    @Const double[] x0,
    int maxite,
    double tol,
    double[] mu,
    double[] x);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 mu0,
    @Cast("const cuComplex*") float2 x0,
    int maxite,
    float tol,
    @Cast("cuComplex*") float2 mu,
    @Cast("cuComplex*") float2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 mu0,
    @Cast("const cuComplex*") float2 x0,
    int maxite,
    float tol,
    @Cast("cuComplex*") float2 mu,
    @Cast("cuComplex*") float2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuComplex*") float2 mu0,
    @Cast("const cuComplex*") float2 x0,
    int maxite,
    float tol,
    @Cast("cuComplex*") float2 mu,
    @Cast("cuComplex*") float2 x);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 mu0,
    @Cast("const cuDoubleComplex*") double2 x0,
    int maxite,
    double tol,
    @Cast("cuDoubleComplex*") double2 mu,
    @Cast("cuDoubleComplex*") double2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 mu0,
    @Cast("const cuDoubleComplex*") double2 x0,
    int maxite,
    double tol,
    @Cast("cuDoubleComplex*") double2 mu,
    @Cast("cuDoubleComplex*") double2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigvsiHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 mu0,
    @Cast("const cuDoubleComplex*") double2 x0,
    int maxite,
    double tol,
    @Cast("cuDoubleComplex*") double2 mu,
    @Cast("cuDoubleComplex*") double2 x);


/* --------- GPU eigenvalue solver based on shift inverse
 *      solve A*x = lambda * x 
 *   where lambda is the eigenvalue nearest mu0.
 * [eig] stands for eigenvalue solver
 * [si] stands for shift-inverse
 */
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    float mu0,
    @Const FloatPointer x0,
    int maxite,
    float eps,
    FloatPointer mu,
    FloatPointer x);
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    float mu0,
    @Const FloatBuffer x0,
    int maxite,
    float eps,
    FloatBuffer mu,
    FloatBuffer x);
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    float mu0,
    @Const float[] x0,
    int maxite,
    float eps,
    float[] mu,
    float[] x);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    double mu0,
    @Const DoublePointer x0,
    int maxite,
    double eps,
    DoublePointer mu, 
    DoublePointer x);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    double mu0,
    @Const DoubleBuffer x0,
    int maxite,
    double eps,
    DoubleBuffer mu, 
    DoubleBuffer x);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    double mu0,
    @Const double[] x0,
    int maxite,
    double eps,
    double[] mu, 
    double[] x);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 mu0,
    @Cast("const cuComplex*") float2 x0,
    int maxite,
    float eps,
    @Cast("cuComplex*") float2 mu, 
    @Cast("cuComplex*") float2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 mu0,
    @Cast("const cuComplex*") float2 x0,
    int maxite,
    float eps,
    @Cast("cuComplex*") float2 mu, 
    @Cast("cuComplex*") float2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuComplex*") float2 mu0,
    @Cast("const cuComplex*") float2 x0,
    int maxite,
    float eps,
    @Cast("cuComplex*") float2 mu, 
    @Cast("cuComplex*") float2 x);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 mu0,
    @Cast("const cuDoubleComplex*") double2 x0,
    int maxite,
    double eps,
    @Cast("cuDoubleComplex*") double2 mu, 
    @Cast("cuDoubleComplex*") double2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 mu0,
    @Cast("const cuDoubleComplex*") double2 x0,
    int maxite,
    double eps,
    @Cast("cuDoubleComplex*") double2 mu, 
    @Cast("cuDoubleComplex*") double2 x);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigvsi(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 mu0,
    @Cast("const cuDoubleComplex*") double2 x0,
    int maxite,
    double eps,
    @Cast("cuDoubleComplex*") double2 mu, 
    @Cast("cuDoubleComplex*") double2 x);


// ----------- enclosed eigenvalues

public static native @Cast("cusolverStatus_t") int cusolverSpScsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 left_bottom_corner,
    @ByVal @Cast("cuComplex*") float2 right_upper_corner,
    IntPointer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 left_bottom_corner,
    @ByVal @Cast("cuComplex*") float2 right_upper_corner,
    IntBuffer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpScsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuComplex*") float2 left_bottom_corner,
    @ByVal @Cast("cuComplex*") float2 right_upper_corner,
    int[] num_eigs);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 left_bottom_corner,
    @ByVal @Cast("cuDoubleComplex*") double2 right_upper_corner,
    IntPointer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 left_bottom_corner,
    @ByVal @Cast("cuDoubleComplex*") double2 right_upper_corner,
    IntBuffer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 left_bottom_corner,
    @ByVal @Cast("cuDoubleComplex*") double2 right_upper_corner,
    int[] num_eigs);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 left_bottom_corner,
    @ByVal @Cast("cuComplex*") float2 right_upper_corner,
    IntPointer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuComplex*") float2 left_bottom_corner,
    @ByVal @Cast("cuComplex*") float2 right_upper_corner,
    IntBuffer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuComplex*") float2 left_bottom_corner,
    @ByVal @Cast("cuComplex*") float2 right_upper_corner,
    int[] num_eigs);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 left_bottom_corner,
    @ByVal @Cast("cuDoubleComplex*") double2 right_upper_corner,
    IntPointer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 left_bottom_corner,
    @ByVal @Cast("cuDoubleComplex*") double2 right_upper_corner,
    IntBuffer num_eigs);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsreigsHost(
    cusolverSpContext handle,
    int m,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @ByVal @Cast("cuDoubleComplex*") double2 left_bottom_corner,
    @ByVal @Cast("cuDoubleComplex*") double2 right_upper_corner,
    int[] num_eigs);



/* --------- CPU symrcm
 *   Symmetric reverse Cuthill McKee permutation         
 *
 */
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymrcmHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    IntPointer p);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymrcmHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    IntBuffer p);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymrcmHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    int[] p);

/* --------- CPU symmdq 
 *   Symmetric minimum degree algorithm based on quotient graph
 *
 */
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymmdqHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    IntPointer p);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymmdqHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    IntBuffer p);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymmdqHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    int[] p);

/* --------- CPU symmdq 
 *   Symmetric Approximate minimum degree algorithm based on quotient graph
 *
 */
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymamdHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    IntPointer p);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymamdHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    IntBuffer p);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrsymamdHost(
    cusolverSpContext handle,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    int[] p);


/* --------- CPU permuation
 *   P*A*Q^T        
 *
 */
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrperm_bufferSizeHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const IntPointer p,
    @Const IntPointer q,
    @Cast("size_t*") SizeTPointer bufferSizeInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrperm_bufferSizeHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const IntBuffer p,
    @Const IntBuffer q,
    @Cast("size_t*") SizeTPointer bufferSizeInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrperm_bufferSizeHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const int[] p,
    @Const int[] q,
    @Cast("size_t*") SizeTPointer bufferSizeInBytes);

public static native @Cast("cusolverStatus_t") int cusolverSpXcsrpermHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    IntPointer csrRowPtrA,
    IntPointer csrColIndA,
    @Const IntPointer p,
    @Const IntPointer q,
    IntPointer map,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrpermHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    IntBuffer csrRowPtrA,
    IntBuffer csrColIndA,
    @Const IntBuffer p,
    @Const IntBuffer q,
    IntBuffer map,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrpermHost(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    int[] csrRowPtrA,
    int[] csrColIndA,
    @Const int[] p,
    @Const int[] q,
    int[] map,
    Pointer pBuffer);



/*
 *  Low-level API: Batched QR
 *
 */

public static native @Cast("cusolverStatus_t") int cusolverSpCreateCsrqrInfo(
    @ByPtrPtr csrqrInfo info);

public static native @Cast("cusolverStatus_t") int cusolverSpDestroyCsrqrInfo(
    csrqrInfo info);


public static native @Cast("cusolverStatus_t") int cusolverSpXcsrqrAnalysisBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    csrqrInfo info);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrqrAnalysisBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    csrqrInfo info);
public static native @Cast("cusolverStatus_t") int cusolverSpXcsrqrAnalysisBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnzA,
    cusparseMatDescr descrA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    csrqrInfo info);

public static native @Cast("cusolverStatus_t") int cusolverSpScsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntPointer csrRowPtr,
    @Const IntPointer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const IntBuffer csrRowPtr,
    @Const IntBuffer csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrqrBufferInfoBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrVal,
    @Const int[] csrRowPtr,
    @Const int[] csrColInd,
    int batchSize,
    csrqrInfo info,
    @Cast("size_t*") SizeTPointer internalDataInBytes,
    @Cast("size_t*") SizeTPointer workspaceInBytes);

public static native @Cast("cusolverStatus_t") int cusolverSpScsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatPointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const FloatPointer b,   
    FloatPointer x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const FloatBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const FloatBuffer b,   
    FloatBuffer x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpScsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const float[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const float[] b,   
    float[] x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);

public static native @Cast("cusolverStatus_t") int cusolverSpDcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoublePointer csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Const DoublePointer b,   
    DoublePointer x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const DoubleBuffer csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Const DoubleBuffer b,   
    DoubleBuffer x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpDcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Const double[] csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Const double[] b,   
    double[] x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);

public static native @Cast("cusolverStatus_t") int cusolverSpCcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuComplex*") float2 b, 
    @Cast("cuComplex*") float2 x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuComplex*") float2 b, 
    @Cast("cuComplex*") float2 x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpCcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuComplex*") float2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuComplex*") float2 b, 
    @Cast("cuComplex*") float2 x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);

public static native @Cast("cusolverStatus_t") int cusolverSpZcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntPointer csrRowPtrA,
    @Const IntPointer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,  
    @Cast("cuDoubleComplex*") double2 x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const IntBuffer csrRowPtrA,
    @Const IntBuffer csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,  
    @Cast("cuDoubleComplex*") double2 x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);
public static native @Cast("cusolverStatus_t") int cusolverSpZcsrqrsvBatched(
    cusolverSpContext handle,
    int m,
    int n,
    int nnz,
    cusparseMatDescr descrA,
    @Cast("const cuDoubleComplex*") double2 csrValA,
    @Const int[] csrRowPtrA,
    @Const int[] csrColIndA,
    @Cast("const cuDoubleComplex*") double2 b,  
    @Cast("cuDoubleComplex*") double2 x,  
    int batchSize,
    csrqrInfo info,
    Pointer pBuffer);




// #if defined(__cplusplus)
// #endif /* __cplusplus */

// #endif // define CUSOLVERSP_H_





}
