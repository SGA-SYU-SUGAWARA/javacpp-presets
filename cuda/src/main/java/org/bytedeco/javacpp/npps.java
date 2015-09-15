// Targeted by JavaCPP version 1.1-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.cuda.*;
import static org.bytedeco.javacpp.nppc.*;

public class npps extends org.bytedeco.javacpp.presets.npps {
    static { Loader.load(); }

// Parsed from <npps.h>

 /* Copyright 2010-2014 NVIDIA Corporation.  All rights reserved. 
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
// #ifndef NV_NPPS_H
// #define NV_NPPS_H
 
/**
 * \file npps.h
 * NPP Signal Processing Functionality.
 */
 
// #ifdef __cplusplus
// #endif

// #include "nppdefs.h"

/** @defgroup npps NPP Signal Processing
 *
 * @{
 *
 */

// #include "npps_support_functions.h"
// #include "npps_initialization.h"
// #include "npps_conversion_functions.h"
// #include "npps_arithmetic_and_logical_operations.h"
// #include "npps_statistics_functions.h"
// #include "npps_filtering_functions.h"

/** @} end of Signal Processing module */
 
// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPS_H */


// Parsed from <npps_support_functions.h>

 /* Copyright 2010-2014 NVIDIA Corporation.  All rights reserved. 
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
// #ifndef NV_NPPS_SUPPORT_FUNCTIONS_H
// #define NV_NPPS_SUPPORT_FUNCTIONS_H
 
/**
 * \file npps_support_functions.h
 * Signal Processing Support Functions.
 */
 
// #include "nppdefs.h"


// #ifdef __cplusplus
// #endif


/** @defgroup signal_memory_management Memory Management
 *  @ingroup npps
 *
 * @{
 */

/** @defgroup signal_malloc Malloc
 * Signal-allocator methods for allocating 1D arrays of data in device memory.
 * All allocators have size parameters to specify the size of the signal (1D array)
 * being allocated.
 *
 * The allocator methods return a pointer to the newly allocated memory of appropriate
 * type. If device-memory allocation is not possible due to resource constaints
 * the allocators return 0 (i.e. NULL pointer). 
 *
 * All signal allocators allocate memory aligned such that it is  beneficial to the 
 * performance of the majority of the signal-processing primitives. 
 * It is no mandatory however to use these allocators. Any valid
 * CUDA device-memory pointers can be passed to NPP primitives. 
 *
 * @{
 */

/**
 * 8-bit unsigned signal allocator.
 * \param nSize Number of unsigned chars in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp8u*") BytePointer nppsMalloc_8u(int nSize);

/**
 * 8-bit signed signal allocator.
 * \param nSize Number of (signed) chars in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp8s*") BytePointer nppsMalloc_8s(int nSize);

/**
 * 16-bit unsigned signal allocator.
 * \param nSize Number of unsigned shorts in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp16u*") ShortPointer nppsMalloc_16u(int nSize);

/**
 * 16-bit signal allocator.
 * \param nSize Number of shorts in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp16s*") ShortPointer nppsMalloc_16s(int nSize);

/**
 * 16-bit complex-value signal allocator.
 * \param nSize Number of 16-bit complex numbers in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native Npp16sc nppsMalloc_16sc(int nSize);

/**
 * 32-bit unsigned signal allocator.
 * \param nSize Number of unsigned ints in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp32u*") IntPointer nppsMalloc_32u(int nSize);

/**
 * 32-bit integer signal allocator.
 * \param nSize Number of ints in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp32s*") IntPointer nppsMalloc_32s(int nSize);

/**
 * 32-bit complex integer signal allocator.
 * \param nSize Number of complex integner values in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native Npp32sc nppsMalloc_32sc(int nSize);

/**
 * 32-bit float signal allocator.
 * \param nSize Number of floats in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp32f*") FloatPointer nppsMalloc_32f(int nSize);

/**
 * 32-bit complex float signal allocator.
 * \param nSize Number of complex float values in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native Npp32fc nppsMalloc_32fc(int nSize);

/**
 * 64-bit long integer signal allocator.
 * \param nSize Number of long ints in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp64s*") LongPointer nppsMalloc_64s(int nSize);

/**
 * 64-bit complex long integer signal allocator.
 * \param nSize Number of complex long int values in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native Npp64sc nppsMalloc_64sc(int nSize);

/**
 * 64-bit float (double) signal allocator.
 * \param nSize Number of doubles in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native @Cast("Npp64f*") DoublePointer nppsMalloc_64f(int nSize);

/**
 * 64-bit complex complex signal allocator.
 * \param nSize Number of complex double valuess in the new signal.
 * \return A pointer to the new signal. 0 (NULL-pointer) indicates
 *         that an error occurred during allocation.
 */
public static native Npp64fc nppsMalloc_64fc(int nSize);

/** @} signal_malloc */

/** @defgroup signal_free Free
 * Free  signal memory.
 *
 * @{
 */
 
/**
 * Free method for any signal memory.
 * \param pValues A pointer to memory allocated using nppiMalloc_<modifier>.
 */
public static native void nppsFree(Pointer pValues);

/** @} signal_free */

/** end of Memory management functions
 * 
 * @}
 *
 */



// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPS_SUPPORT_FUNCTIONS_H */


// Parsed from <npps_initialization.h>

 /* Copyright 2010-2014 NVIDIA Corporation.  All rights reserved. 
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
// #ifndef NV_NPPS_INITIALIZATION_H
// #define NV_NPPS_INITIALIZATION_H
 
/**
 * \file npps_initialization.h
 * NPP Signal Processing Functionality.
 */
 
// #include "nppdefs.h"


// #ifdef __cplusplus
// #endif


/** @defgroup signal_initialization Initialization
 * @ingroup npps
 *
 * @{
 */

/** \defgroup signal_set Set
 *
 * @{
 *
 */

/** @name Set 
 * Set methods for 1D vectors of various types. The copy methods operate on vector data given
 * as a pointer to the underlying data-type (e.g. 8-bit vectors would
 * be passed as pointers to Npp8u type) and length of the vectors, i.e. the number of items.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_8u(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_8u(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_8u(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 8-bit signed char, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_8s(@Cast("Npp8s") byte nValue, @Cast("Npp8s*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_8s(@Cast("Npp8s") byte nValue, @Cast("Npp8s*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_8s(@Cast("Npp8s") byte nValue, @Cast("Npp8s*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned integer, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_16u(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_16u(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_16u(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 16-bit signed integer, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_16s(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_16s(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_16s(@Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 16-bit integer complex, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_16sc(@ByVal Npp16sc nValue, Npp16sc pDst, int nLength);

/** 
 * 32-bit unsigned integer, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_32u(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_32u(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_32u(@Cast("Npp32u") int nValue, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 32-bit signed integer, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_32s(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_32s(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_32s(@Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pDst, int nLength);

/** 
 * 32-bit integer complex, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_32sc(@ByVal Npp32sc nValue, Npp32sc pDst, int nLength);

/** 
 * 32-bit float, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_32f(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_32f(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_32f(@Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit float complex, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_32fc(@ByVal Npp32fc nValue, Npp32fc pDst, int nLength);

/** 
 * 64-bit long long integer, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_64s(@Cast("Npp64s") long nValue, @Cast("Npp64s*") LongPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_64s(@Cast("Npp64s") long nValue, @Cast("Npp64s*") LongBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_64s(@Cast("Npp64s") long nValue, @Cast("Npp64s*") long[] pDst, int nLength);

/** 
 * 64-bit long long integer complex, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_64sc(@ByVal Npp64sc nValue, Npp64sc pDst, int nLength);

/** 
 * 64-bit double, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_64f(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_64f(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSet_64f(@Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit double complex, vector set method.
 * \param nValue Value used to initialize the vector pDst.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSet_64fc(@ByVal Npp64fc nValue, Npp64fc pDst, int nLength);

/** @} end of Signal Set */
/** @} signal_set */

/** \defgroup signal_zero Zero
 *
 * @{
 *
 */

/** @name Zero
 * Set signals to zero.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_8u(@Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_8u(@Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_8u(@Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit integer, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_16s(@Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_16s(@Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_16s(@Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 16-bit integer complex, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_16sc(Npp16sc pDst, int nLength);

/** 
 * 32-bit integer, vector zero method.
  * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_32s(@Cast("Npp32s*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_32s(@Cast("Npp32s*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_32s(@Cast("Npp32s*") int[] pDst, int nLength);

/** 
 * 32-bit integer complex, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_32sc(Npp32sc pDst, int nLength);

/** 
 * 32-bit float, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_32f(@Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_32f(@Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_32f(@Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit float complex, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_32fc(Npp32fc pDst, int nLength);

/** 
 * 64-bit long long integer, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_64s(@Cast("Npp64s*") LongPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_64s(@Cast("Npp64s*") LongBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_64s(@Cast("Npp64s*") long[] pDst, int nLength);

/** 
 * 64-bit long long integer complex, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_64sc(Npp64sc pDst, int nLength);

/** 
 * 64-bit double, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_64f(@Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_64f(@Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsZero_64f(@Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit double complex, vector zero method.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZero_64fc(Npp64fc pDst, int nLength);

/** @} end of Zero */

/** @} signal_zero */

/** \defgroup signal_copy Copy
 *
 * @{
 *
 */

/** @name Copy
 * Copy methods for various type signals. Copy methods operate on
 * signal data given as a pointer to the underlying data-type (e.g. 8-bit
 * vectors would be passed as pointers to Npp8u type) and length of the
 * vectors, i.e. the number of items. 
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char, vector copy method
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_8u(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_8u(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_8u(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit signed short, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_16s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_16s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_16s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 32-bit signed integer, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_32s(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_32s(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_32s(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength);

/** 
 * 32-bit float, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit signed integer, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_64s(@Cast("const Npp64s*") LongPointer pSrc, @Cast("Npp64s*") LongPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_64s(@Cast("const Npp64s*") LongBuffer pSrc, @Cast("Npp64s*") LongBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCopy_64s(@Cast("const Npp64s*") long[] pSrc, @Cast("Npp64s*") long[] pDst, int nLength);

/** 
 * 16-bit complex short, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_16sc(@Const Npp16sc pSrc, Npp16sc pDst, int nLength);

/** 
 * 32-bit complex signed integer, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_32sc(@Const Npp32sc pSrc, Npp32sc pDst, int nLength);

/** 
 * 32-bit complex float, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex signed integer, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_64sc(@Const Npp64sc pSrc, Npp64sc pDst, int nLength);

/** 
 * 64-bit complex double, vector copy method.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCopy_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength);

/** @} end of Copy */

/** @} signal_copy */

/** @} signal_initialization */

// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPS_INITIALIZATION_H */


// Parsed from <npps_conversion_functions.h>

 /* Copyright 2010-2014 NVIDIA Corporation.  All rights reserved. 
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
// #ifndef NV_NPPS_CONVERSION_FUNCTIONS_H
// #define NV_NPPS_CONVERSION_FUNCTIONS_H
 
/**
 * \file npps_conversion_functions.h
 * NPP Signal Processing Functionality.
 */
 
// #include "nppdefs.h"


// #ifdef __cplusplus
// #endif


/** @defgroup signal_conversion_functions Conversion Functions
 *  @ingroup npps
 *
 * @{
 *
 */

/** @defgroup signal_convert Convert
 *
 * @{
 *
 */

/** @name Convert
 * Routines for converting the sample-data type of signals.
 *
 * @{
 *
 */

public static native @Cast("NppStatus") int nppsConvert_8s16s(@Cast("const Npp8s*") BytePointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_8s16s(@Cast("const Npp8s*") ByteBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_8s16s(@Cast("const Npp8s*") byte[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_8s32f(@Cast("const Npp8s*") BytePointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_8s32f(@Cast("const Npp8s*") ByteBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_8s32f(@Cast("const Npp8s*") byte[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_8u32f(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_8u32f(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_8u32f(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_16s8s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp8s*") BytePointer pDst, @Cast("Npp32u") int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_16s8s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp8s*") ByteBuffer pDst, @Cast("Npp32u") int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_16s8s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp8s*") byte[] pDst, @Cast("Npp32u") int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_16s32s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_16s32s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_16s32s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_16s32f(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_16s32f(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_16u32f(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_16u32f(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_16u32f(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_32s16s(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32s16s(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32s16s(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_32s32f(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32s32f(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32s32f(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_32s64f(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32s64f(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32s64f(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_32f64f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32f64f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_32f64f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_64s64f(@Cast("const Npp64s*") LongPointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_64s64f(@Cast("const Npp64s*") LongBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_64s64f(@Cast("const Npp64s*") long[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_64f32f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_64f32f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsConvert_64f32f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

public static native @Cast("NppStatus") int nppsConvert_16s32f_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_16s32f_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_16s32f_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_16s64f_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_16s64f_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_16s64f_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32s16s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32s16s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32s16s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32s32f_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32s32f_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32s32f_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32s64f_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32s64f_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32s64f_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32f8s_Sfs(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp8s*") BytePointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f8s_Sfs(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp8s*") ByteBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f8s_Sfs(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp8s*") byte[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32f8u_Sfs(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp8u*") BytePointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f8u_Sfs(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp8u*") ByteBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f8u_Sfs(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp8u*") byte[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32f16s_Sfs(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f16s_Sfs(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f16s_Sfs(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32f16u_Sfs(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp16u*") ShortPointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f16u_Sfs(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp16u*") ShortBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f16u_Sfs(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp16u*") short[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_32f32s_Sfs(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f32s_Sfs(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_32f32s_Sfs(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_64s32s_Sfs(@Cast("const Npp64s*") LongPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64s32s_Sfs(@Cast("const Npp64s*") LongBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64s32s_Sfs(@Cast("const Npp64s*") long[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_64f16s_Sfs(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64f16s_Sfs(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64f16s_Sfs(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_64f32s_Sfs(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64f32s_Sfs(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64f32s_Sfs(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

public static native @Cast("NppStatus") int nppsConvert_64f64s_Sfs(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64s*") LongPointer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64f64s_Sfs(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64s*") LongBuffer pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsConvert_64f64s_Sfs(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64s*") long[] pDst, int nLength, @Cast("NppRoundMode") int eRoundMode, int nScaleFactor);

/** @} end of Convert */

/** @} signal_convert */

/** @defgroup signal_threshold Threshold
 *
 * @{
 *
 */

/** @name Threshold Functions
 * Performs the threshold operation on the samples of a signal by limiting the sample values by a specified constant value.
 *
 * @{
 *
 */

/** 
 * 16-bit signed short signal threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_16s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_16s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_16s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 16-bit in place signed short signal threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_16s_I(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_16s_I(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_16s_I(@Cast("Npp16s*") short[] pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 16-bit signed short complex number signal threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_16sc(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 16-bit in place signed short complex number signal threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_16sc_I(Npp16sc pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 32-bit floating point signal threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 32-bit in place floating point signal threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 32-bit floating point complex number signal threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 32-bit in place floating point complex number signal threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_32fc_I(Npp32fc pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 64-bit floating point signal threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 64-bit in place floating point signal threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);
public static native @Cast("NppStatus") int nppsThreshold_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 64-bit floating point complex number signal threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 64-bit in place floating point complex number signal threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nRelOp NppCmpOp type of thresholding operation (NPP_CMP_LESS or NPP_CMP_GREATER only).
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_64fc_I(Npp64fc pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("NppCmpOp") int nRelOp);

/** 
 * 16-bit signed short signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_16s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_16s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_16s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 16-bit in place signed short signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_16s_I(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_16s_I(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_16s_I(@Cast("Npp16s*") short[] pSrcDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 16-bit signed short complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_16sc(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 16-bit in place signed short complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_16sc_I(Npp16sc pSrcDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 32-bit floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 32-bit in place floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 32-bit floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 32-bit in place floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_32fc_I(Npp32fc pSrcDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 64-bit floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 64-bit in place floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_LT_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 64-bit floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 64-bit in place floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LT_64fc_I(Npp64fc pSrcDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 16-bit signed short signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_16s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_16s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_16s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 16-bit in place signed short signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_16s_I(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_16s_I(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, @Cast("Npp16s") short nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_16s_I(@Cast("Npp16s*") short[] pSrcDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 16-bit signed short complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_16sc(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 16-bit in place signed short complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_16sc_I(Npp16sc pSrcDst, int nLength, @Cast("Npp16s") short nLevel);

/** 
 * 32-bit floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 32-bit in place floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength, @Cast("Npp32f") float nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 32-bit floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 32-bit in place floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_32fc_I(Npp32fc pSrcDst, int nLength, @Cast("Npp32f") float nLevel);

/** 
 * 64-bit floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 64-bit in place floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength, @Cast("Npp64f") double nLevel);
public static native @Cast("NppStatus") int nppsThreshold_GT_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 64-bit floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 64-bit in place floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GT_64fc_I(Npp64fc pSrcDst, int nLength, @Cast("Npp64f") double nLevel);

/** 
 * 16-bit signed short signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);

/** 
 * 16-bit in place signed short signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16s_I(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16s_I(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16s_I(@Cast("Npp16s*") short[] pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);

/** 
 * 16-bit signed short complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16sc(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, @Cast("Npp16s") short nLevel, @ByVal Npp16sc nValue);

/** 
 * 16-bit in place signed short complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_16sc_I(Npp16sc pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @ByVal Npp16sc nValue);

/** 
 * 32-bit floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);

/** 
 * 32-bit in place floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);

/** 
 * 32-bit floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength, @Cast("Npp32f") float nLevel, @ByVal Npp32fc nValue);

/** 
 * 32-bit in place floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_32fc_I(Npp32fc pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @ByVal Npp32fc nValue);

/** 
 * 64-bit floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);

/** 
 * 64-bit in place floating point signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);

/** 
 * 64-bit floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength, @Cast("Npp64f") double nLevel, @ByVal Npp64fc nValue);

/** 
 * 64-bit in place floating point complex number signal NPP_CMP_LESS threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_LTVal_64fc_I(Npp64fc pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @ByVal Npp64fc nValue);

/** 
 * 16-bit signed short signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);

/** 
 * 16-bit in place signed short signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16s_I(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16s_I(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16s_I(@Cast("Npp16s*") short[] pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @Cast("Npp16s") short nValue);

/** 
 * 16-bit signed short complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16sc(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, @Cast("Npp16s") short nLevel, @ByVal Npp16sc nValue);

/** 
 * 16-bit in place signed short complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_16sc_I(Npp16sc pSrcDst, int nLength, @Cast("Npp16s") short nLevel, @ByVal Npp16sc nValue);

/** 
 * 32-bit floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);

/** 
 * 32-bit in place floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @Cast("Npp32f") float nValue);

/** 
 * 32-bit floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength, @Cast("Npp32f") float nLevel, @ByVal Npp32fc nValue);

/** 
 * 32-bit in place floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_32fc_I(Npp32fc pSrcDst, int nLength, @Cast("Npp32f") float nLevel, @ByVal Npp32fc nValue);

/** 
 * 64-bit floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);

/** 
 * 64-bit in place floating point signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @Cast("Npp64f") double nValue);

/** 
 * 64-bit floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength, @Cast("Npp64f") double nLevel, @ByVal Npp64fc nValue);

/** 
 * 64-bit in place floating point complex number signal NPP_CMP_GREATER threshold with constant level.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nLevel Constant threshold value (real part only and must be greater than 0) to be used to limit each signal sample
 * \param nValue Constant value to replace source value when threshold test is true.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsThreshold_GTVal_64fc_I(Npp64fc pSrcDst, int nLength, @Cast("Npp64f") double nLevel, @ByVal Npp64fc nValue);

/** @} end of Threshold */

/** @} signal_threshold */

/** @} signal_conversion_functions */

// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPS_CONVERSION_FUNCTIONS_H */


// Parsed from <npps_arithmetic_and_logical_operations.h>

 /* Copyright 2010-2014 NVIDIA Corporation.  All rights reserved. 
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
// #ifndef NV_NPPS_ARITHMETIC_AND_LOGICAL_OPERATIONS_H
// #define NV_NPPS_ARITHMETIC_AND_LOGICAL_OPERATIONS_H
 
/**
 * \file npps_arithmetic_and_logical_operations.h
 * Signal Arithmetic and Logical Operations.
 */
 
// #include "nppdefs.h"


// #ifdef __cplusplus
// #endif


/** 
 * @defgroup signal_arithmetic_and_logical_operations Arithmetic and Logical Operations
 * @ingroup npps
 *
 * @{
 *
 */

/** 
 * @defgroup signal_arithmetic Arithmetic Operations
 *
 * @{
 *
 */

/** 
 * @defgroup signal_addc AddC
 * Adds a constant value to each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char in place signal add constant,
 * scale, then clamp to saturated value
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 8-bit unsigned charvector add constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal add constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short vector add constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16u_Sfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place  signal add constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal add constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary)signal add constant, 
 * scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_16sc_ISfs(@ByVal Npp16sc nValue, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary) signal add constant,
 * scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_16sc_Sfs(@Const Npp16sc pSrc, @ByVal Npp16sc nValue, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal add constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integersignal add constant and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddC_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary) in place signal
 * add constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32sc_ISfs(@ByVal Npp32sc nValue, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary) signal add constant
 * and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32sc_Sfs(@Const Npp32sc pSrc, @ByVal Npp32sc nValue, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point in place signal add constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 32-bit floating point signal add constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) in
 * place signal add constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32fc_I(@ByVal Npp32fc nValue, Npp32fc pSrcDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) signal
 * add constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_32fc(@Const Npp32fc pSrc, @ByVal Npp32fc nValue, Npp32fc pDst, int nLength);

/** 
 * 64-bit floating point, in place signal add constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength Length of the vectors, number of items.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 64-bit floating pointsignal add constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddC_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) in
 * place signal add constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_64fc_I(@ByVal Npp64fc nValue, Npp64fc pSrcDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) signal
 * add constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be added to each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddC_64fc(@Const Npp64fc pSrc, @ByVal Npp64fc nValue, Npp64fc pDst, int nLength);

/** @} signal_addc */

/** 
 * @defgroup signal_addproductc AddProductC
 * Adds product of a constant and each sample of a source signal to the each sample of destination signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal add product of signal times constant to destination signal.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProductC_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddProductC_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddProductC_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** @} signal_addproductc */

/** 
 * @defgroup signal_mulc MulC
 *
 * Multiplies each sample of a signal by a constant value.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char in place signal times constant,
 * scale, then clamp to saturated value
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 8-bit unsigned char signal times constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal times constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal times constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16u_Sfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal times constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal times constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary)signal times constant, 
 * scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_16sc_ISfs(@ByVal Npp16sc nValue, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary)signal times constant,
 * scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_16sc_Sfs(@Const Npp16sc pSrc, @ByVal Npp16sc nValue, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal times constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal times constant and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary) in place signal
 * times constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32sc_ISfs(@ByVal Npp32sc nValue, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary) signal times constant
 * and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32sc_Sfs(@Const Npp32sc pSrc, @ByVal Npp32sc nValue, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point in place signal times constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 32-bit floating point signal times constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit floating point signal times constant with output converted to 16-bit signed integer.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_Low_32f16s(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_Low_32f16s(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_Low_32f16s(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 32-bit floating point signal times constant with output converted to 16-bit signed integer
 * with scaling and saturation of output result.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32f16s_Sfs(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_32f16s_Sfs(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_32f16s_Sfs(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) in
 * place signal times constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32fc_I(@ByVal Npp32fc nValue, Npp32fc pSrcDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) signal
 * times constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_32fc(@Const Npp32fc pSrc, @ByVal Npp32fc nValue, Npp32fc pDst, int nLength);

/** 
 * 64-bit floating point, in place signal times constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength Length of the vectors, number of items.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal times constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMulC_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit floating point signal times constant with in place conversion to 64-bit signed integer
 * and with scaling and saturation of output result.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_64f64s_ISfs(@Cast("Npp64f") double nValue, @Cast("Npp64s*") LongPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_64f64s_ISfs(@Cast("Npp64f") double nValue, @Cast("Npp64s*") LongBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMulC_64f64s_ISfs(@Cast("Npp64f") double nValue, @Cast("Npp64s*") long[] pDst, int nLength, int nScaleFactor);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) in
 * place signal times constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_64fc_I(@ByVal Npp64fc nValue, Npp64fc pSrcDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) signal
 * times constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be multiplied by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMulC_64fc(@Const Npp64fc pSrc, @ByVal Npp64fc nValue, Npp64fc pDst, int nLength);

/** @} signal_mulc */

/** 
 * @defgroup signal_subc SubC
 *
 * Subtracts a constant from each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char in place signal subtract constant,
 * scale, then clamp to saturated value
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 8-bit unsigned char signal subtract constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal subtract constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal subtract constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16u_Sfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal subtract constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal subtract constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary) signal subtract constant, 
 * scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_16sc_ISfs(@ByVal Npp16sc nValue, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary) signal subtract constant,
 * scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_16sc_Sfs(@Const Npp16sc pSrc, @ByVal Npp16sc nValue, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal subtract constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal subtract constant and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubC_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary) in place signal
 * subtract constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32sc_ISfs(@ByVal Npp32sc nValue, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary)signal subtract constant
 * and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32sc_Sfs(@Const Npp32sc pSrc, @ByVal Npp32sc nValue, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point in place signal subtract constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 32-bit floating point signal subtract constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) in
 * place signal subtract constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32fc_I(@ByVal Npp32fc nValue, Npp32fc pSrcDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) signal
 * subtract constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_32fc(@Const Npp32fc pSrc, @ByVal Npp32fc nValue, Npp32fc pDst, int nLength);

/** 
 * 64-bit floating point, in place signal subtract constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength Length of the vectors, number of items.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal subtract constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubC_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) in
 * place signal subtract constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_64fc_I(@ByVal Npp64fc nValue, Npp64fc pSrcDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) signal
 * subtract constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be subtracted from each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubC_64fc(@Const Npp64fc pSrc, @ByVal Npp64fc nValue, Npp64fc pDst, int nLength);

/** @} signal_subc */

/** 
 * @defgroup signal_subcrev SubCRev
 *
 * Subtracts each sample of a signal from a constant.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char in place signal subtract from constant,
 * scale, then clamp to saturated value
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 8-bit unsigned char signal subtract from constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal subtract from constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal subtract from constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16u_Sfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal subtract from constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal subtract from constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary) signal subtract from constant, 
 * scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_16sc_ISfs(@ByVal Npp16sc nValue, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary) signal subtract from constant,
 * scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_16sc_Sfs(@Const Npp16sc pSrc, @ByVal Npp16sc nValue, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal subtract from constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_32s_ISfs(@Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integersignal subtract from constant and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSubCRev_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s") int nValue, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary) in place signal
 * subtract from constant and scale.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32sc_ISfs(@ByVal Npp32sc nValue, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit integer complex number (32 bit real, 32 bit imaginary) signal subtract from constant
 * and scale.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32sc_Sfs(@Const Npp32sc pSrc, @ByVal Npp32sc nValue, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point in place signal subtract from constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 32-bit floating point signal subtract from constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) in
 * place signal subtract from constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32fc_I(@ByVal Npp32fc nValue, Npp32fc pSrcDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) signal
 * subtract from constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_32fc(@Const Npp32fc pSrc, @ByVal Npp32fc nValue, Npp32fc pDst, int nLength);

/** 
 * 64-bit floating point, in place signal subtract from constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength Length of the vectors, number of items.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal subtract from constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSubCRev_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) in
 * place signal subtract from constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_64fc_I(@ByVal Npp64fc nValue, Npp64fc pSrcDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) signal
 * subtract from constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value each vector element is to be subtracted from
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSubCRev_64fc(@Const Npp64fc pSrc, @ByVal Npp64fc nValue, Npp64fc pDst, int nLength);

/** @} signal_subcrev */

/** 
 * @defgroup signal_divc DivC
 *
 * Divides each sample of a signal by a constant.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char in place signal divided by constant,
 * scale, then clamp to saturated value
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_8u_ISfs(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 8-bit unsigned char signal divided by constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal divided by constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16u_ISfs(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal divided by constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16u_Sfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal divided by constant, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16s_ISfs(@Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal divided by constant, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDivC_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s") short nValue, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary)signal divided by constant, 
 * scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_16sc_ISfs(@ByVal Npp16sc nValue, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit integer complex number (16 bit real, 16 bit imaginary) signal divided by constant,
 * scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_16sc_Sfs(@Const Npp16sc pSrc, @ByVal Npp16sc nValue, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point in place signal divided by constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 32-bit floating point signal divided by constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) in
 * place signal divided by constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_32fc_I(@ByVal Npp32fc nValue, Npp32fc pSrcDst, int nLength);

/** 
 * 32-bit floating point complex number (32 bit real, 32 bit imaginary) signal
 * divided by constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_32fc(@Const Npp32fc pSrc, @ByVal Npp32fc nValue, Npp32fc pDst, int nLength);

/** 
 * 64-bit floating point in place signal divided by constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength Length of the vectors, number of items.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_64f_I(@Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal divided by constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivC_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f") double nValue, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) in
 * place signal divided by constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_64fc_I(@ByVal Npp64fc nValue, Npp64fc pSrcDst, int nLength);

/** 
 * 64-bit floating point complex number (64 bit real, 64 bit imaginary) signal
 * divided by constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided into each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivC_64fc(@Const Npp64fc pSrc, @ByVal Npp64fc nValue, Npp64fc pDst, int nLength);

/** @} signal_divc */

/** 
 * @defgroup signal_divcrev DivCRev
 *
 * Divides a constant by each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 16-bit unsigned short in place constant divided by signal, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided by each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivCRev_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short signal divided by constant, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivCRev_16u(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_16u(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_16u(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit floating point in place constant divided by signal.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be divided by each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivCRev_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_32f_I(@Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 32-bit floating point constant divided by signal.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be divided by each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDivCRev_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDivCRev_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f") float nValue, @Cast("Npp32f*") float[] pDst, int nLength);

/** @} signal_divcrev */

/** 
 * @defgroup signal_add Add
 *
 * Sample by sample addition of two signals.
 *
 * @{
 *
 */

/** 
 * 16-bit signed short signal add signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal add signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned int signal add signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 32-bit floating point signal add signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal add signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit complex floating point signal add signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex floating point signal add signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, Npp64fc pDst, int nLength);

/** 
 * 8-bit unsigned char signal add signal with 16-bit unsigned result,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_8u16u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_8u16u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_8u16u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 16-bit signed short signal add signal with 32-bit floating point result,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be added to signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16s32f(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s32f(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 8-bit unsigned char add signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be added to signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short add signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be added to signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16u_Sfs(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short add signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be added to signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer add signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be added to signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_32s_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 64-bit signed integer add signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be added to signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_64s_Sfs(@Cast("const Npp64s*") LongPointer pSrc1, @Cast("const Npp64s*") LongPointer pSrc2, @Cast("Npp64s*") LongPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_64s_Sfs(@Cast("const Npp64s*") LongBuffer pSrc1, @Cast("const Npp64s*") LongBuffer pSrc2, @Cast("Npp64s*") LongBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_64s_Sfs(@Cast("const Npp64s*") long[] pSrc1, @Cast("const Npp64s*") long[] pSrc2, @Cast("Npp64s*") long[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed complex short add signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be added to signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed complex integer add signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be added to signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32sc_Sfs(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal add signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16s_I(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s_I(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s_I(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit floating point in place signal add signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32f_I(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_32f_I(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_32f_I(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point in place signal add signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_64f_I(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_64f_I(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_64f_I(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 32-bit complex floating point in place signal add signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32fc_I(@Const Npp32fc pSrc, Npp32fc pSrcDst, int nLength);

/** 
 * 64-bit complex floating point in place signal add signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_64fc_I(@Const Npp64fc pSrc, Npp64fc pSrcDst, int nLength);

/** 
 * 16/32-bit signed short in place signal add signal with 32-bit signed integer results,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16s32s_I(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp32s*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s32s_I(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAdd_16s32s_I(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp32s*") int[] pSrcDst, int nLength);

/** 
 * 8-bit unsigned char in place signal add signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_8u_ISfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_8u_ISfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_8u_ISfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal add signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16u_ISfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16u_ISfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16u_ISfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal add signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16s_ISfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16s_ISfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_16s_ISfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal add signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32s_ISfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_32s_ISfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAdd_32s_ISfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short in place signal add signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_16sc_ISfs(@Const Npp16sc pSrc, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit complex signed integer in place signal add signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be added to signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAdd_32sc_ISfs(@Const Npp32sc pSrc, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** @} signal_add */

/** 
 * @defgroup signal_addproduct AddProduct
 *
 * Adds sample by sample product of two signals to the destination signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal add product of source signal times destination signal to destination signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer. product of source1 and source2 signal elements to be added to destination elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProduct_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddProduct_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddProduct_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal add product of source signal times destination signal to destination signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer. product of source1 and source2 signal elements to be added to destination elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProduct_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddProduct_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAddProduct_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit complex floating point signal add product of source signal times destination signal to destination signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer. product of source1 and source2 signal elements to be added to destination elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProduct_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex floating point signal add product of source signal times destination signal to destination signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer. product of source1 and source2 signal elements to be added to destination elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProduct_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, Npp64fc pDst, int nLength);

/** 
 * 16-bit signed short signal add product of source signal1 times source signal2 to destination signal,
 * with scaling, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer. product of source1 and source2 signal elements to be added to destination elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProduct_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddProduct_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddProduct_16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed short signal add product of source signal1 times source signal2 to destination signal,
 * with scaling, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer. product of source1 and source2 signal elements to be added to destination elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProduct_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddProduct_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddProduct_32s_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal add product of source signal1 times source signal2 to 32-bit signed integer destination signal,
 * with scaling, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer. product of source1 and source2 signal elements to be added to destination elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAddProduct_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddProduct_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsAddProduct_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** @} signal_addproduct */

/** 
 * @defgroup signal_mul Mul
 *
 * Sample by sample multiplication the samples of two signals.
 *
 * @{
 *
 */

/** 
 * 16-bit signed short signal times signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_16s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_16s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 32-bit floating point signal times signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal times signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit complex floating point signal times signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex floating point signal times signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, Npp64fc pDst, int nLength);

/** 
 * 8-bit unsigned char signal times signal with 16-bit unsigned result,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_8u16u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_8u16u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_8u16u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 16-bit signed short signal times signal with 32-bit floating point result,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16s32f(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_16s32f(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit floating point signal times 32-bit complex floating point signal with complex 32-bit floating point result,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32f32fc(@Cast("const Npp32f*") FloatPointer pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f32fc(@Cast("const Npp32f*") FloatBuffer pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f32fc(@Cast("const Npp32f*") float[] pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);

/** 
 * 8-bit unsigned char signal times signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal time signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16u_Sfs(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal times signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal times signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed complex short signal times signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed complex integer signal times signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32sc_Sfs(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal times 16-bit signed short signal, scale, then clamp to 16-bit signed saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16u16s_Sfs(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16u16s_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16u16s_Sfs(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal times signal, scale, then clamp to 32-bit signed saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal times 32-bit complex signed integer signal, scale, then clamp to 32-bit complex integer saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32s32sc_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Const Npp32sc pSrc2, Npp32sc pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s32sc_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Const Npp32sc pSrc2, Npp32sc pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s32sc_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Const Npp32sc pSrc2, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal times signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal2 elements to be multiplied by signal1 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_Low_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_Low_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_Low_32s_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal times signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16s_I(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_16s_I(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_16s_I(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit floating point in place signal times signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32f_I(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f_I(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f_I(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point in place signal times signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_64f_I(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_64f_I(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_64f_I(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 32-bit complex floating point in place signal times signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32fc_I(@Const Npp32fc pSrc, Npp32fc pSrcDst, int nLength);

/** 
 * 64-bit complex floating point in place signal times signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_64fc_I(@Const Npp64fc pSrc, Npp64fc pSrcDst, int nLength);

/** 
 * 32-bit complex floating point in place signal times 32-bit floating point signal,
 * then clamp to 32-bit complex floating point saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32f32fc_I(@Cast("const Npp32f*") FloatPointer pSrc, Npp32fc pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f32fc_I(@Cast("const Npp32f*") FloatBuffer pSrc, Npp32fc pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMul_32f32fc_I(@Cast("const Npp32f*") float[] pSrc, Npp32fc pSrcDst, int nLength);

/** 
 * 8-bit unsigned char in place signal times signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_8u_ISfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_8u_ISfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_8u_ISfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal times signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16u_ISfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16u_ISfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16u_ISfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal times signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16s_ISfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16s_ISfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_16s_ISfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal times signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32s_ISfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s_ISfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s_ISfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short in place signal times signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_16sc_ISfs(@Const Npp16sc pSrc, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit complex signed integer in place signal times signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32sc_ISfs(@Const Npp32sc pSrc, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit complex signed integer in place signal times 32-bit signed integer signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be multiplied by signal1 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMul_32s32sc_ISfs(@Cast("const Npp32s*") IntPointer pSrc, Npp32sc pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s32sc_ISfs(@Cast("const Npp32s*") IntBuffer pSrc, Npp32sc pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsMul_32s32sc_ISfs(@Cast("const Npp32s*") int[] pSrc, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** @} signal_mul */

/** 
 * @defgroup signal_sub Sub
 *
 * Sample by sample subtraction of the samples of two signals.
 *
 * @{
 *
 */

/** 
 * 16-bit signed short signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_16s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_16s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 32-bit floating point signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit complex floating point signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex floating point signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, Npp64fc pDst, int nLength);

/** 
 * 16-bit signed short signal subtract 16-bit signed short signal,
 * then clamp and convert to 32-bit floating point saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16s32f(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_16s32f(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 8-bit unsigned char signal subtract signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 elements to be subtracted from signal2 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal subtract signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 elements to be subtracted from signal2 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16u_Sfs(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal subtract signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 elements to be subtracted from signal2 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal subtract signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 elements to be subtracted from signal2 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_32s_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed complex short signal subtract signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 elements to be subtracted from signal2 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed complex integer signal subtract signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 elements to be subtracted from signal2 elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32sc_Sfs(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, Npp32sc pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16s_I(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_16s_I(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_16s_I(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit floating point in place signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32f_I(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_32f_I(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_32f_I(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point in place signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_64f_I(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_64f_I(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSub_64f_I(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 32-bit complex floating point in place signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32fc_I(@Const Npp32fc pSrc, Npp32fc pSrcDst, int nLength);

/** 
 * 64-bit complex floating point in place signal subtract signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_64fc_I(@Const Npp64fc pSrc, Npp64fc pSrcDst, int nLength);

/** 
 * 8-bit unsigned char in place signal subtract signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_8u_ISfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_8u_ISfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_8u_ISfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal subtract signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16u_ISfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16u_ISfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16u_ISfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal subtract signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16s_ISfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16s_ISfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_16s_ISfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal subtract signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32s_ISfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_32s_ISfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSub_32s_ISfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short in place signal subtract signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_16sc_ISfs(@Const Npp16sc pSrc, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit complex signed integer in place signal subtract signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 elements to be subtracted from signal2 elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSub_32sc_ISfs(@Const Npp32sc pSrc, Npp32sc pSrcDst, int nLength, int nScaleFactor);

/** @} signal_sub */

/**
 * @defgroup signal_div Div
 *
 * Sample by sample division of the samples of two signals.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal divide signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal divide signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16u_Sfs(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal divide signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal divide signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_32s_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed complex short signal divide signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_16sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal divided by 16-bit signed short signal, scale, then clamp to 16-bit signed short saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_32s16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_32s16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_32s16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point signal divide signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal divide signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit complex floating point signal divide signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex floating point signal divide signal,
 * then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, Npp64fc pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal divide signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_8u_ISfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_8u_ISfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_8u_ISfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal divide signal, with scaling,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_16u_ISfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16u_ISfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16u_ISfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short in place signal divide signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_16s_ISfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16s_ISfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_16s_ISfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short in place signal divide signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_16sc_ISfs(@Const Npp16sc pSrc, Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer in place signal divide signal, with scaling, 
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_32s_ISfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_32s_ISfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_32s_ISfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit floating point in place signal divide signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_32f_I(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_32f_I(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_32f_I(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point in place signal divide signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_64f_I(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_64f_I(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsDiv_64f_I(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 32-bit complex floating point in place signal divide signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_32fc_I(@Const Npp32fc pSrc, Npp32fc pSrcDst, int nLength);

/** 
 * 64-bit complex floating point in place signal divide signal,
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_64fc_I(@Const Npp64fc pSrc, Npp64fc pSrcDst, int nLength);

/** @} signal_div */

/** 
 * @defgroup signal_divround Div_Round
 *
 * Sample by sample division of the samples of two signals with rounding.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal divide signal, scale, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nRndMode various rounding modes.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_Round_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);

/** 
 * 16-bit unsigned short signal divide signal, scale, round, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nRndMode various rounding modes.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_Round_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16u_Sfs(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);

/** 
 * 16-bit signed short signal divide signal, scale, round, then clamp to saturated value.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer, signal1 divisor elements to be divided into signal2 dividend elements.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nRndMode various rounding modes.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_Round_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);

/** 
 * 8-bit unsigned char in place signal divide signal, with scaling, rounding
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nRndMode various rounding modes.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_Round_8u_ISfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_8u_ISfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_8u_ISfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);

/** 
 * 16-bit unsigned short in place signal divide signal, with scaling, rounding
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nRndMode various rounding modes.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_Round_16u_ISfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16u_ISfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16u_ISfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);

/** 
 * 16-bit signed short in place signal divide signal, with scaling, rounding
 * then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal1 divisor elements to be divided into signal2 dividend elements
 * \param nLength \ref length_specification.
 * \param nRndMode various rounding modes.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDiv_Round_16s_ISfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16s_ISfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);
public static native @Cast("NppStatus") int nppsDiv_Round_16s_ISfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength, @Cast("NppRoundMode") int nRndMode, int nScaleFactor);

/** @} signal_divround */

/** 
 * @defgroup signal_abs Abs
 *
 * Absolute value of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 16-bit signed short signal absolute value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_16s(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_16s(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_16s(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 32-bit signed integer signal absolute value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_32s(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32s(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32s(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength);

/** 
 * 32-bit floating point signal absolute value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal absolute value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 16-bit signed short signal absolute value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_16s_I(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_16s_I(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_16s_I(@Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit signed integer signal absolute value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_32s_I(@Cast("Npp32s*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32s_I(@Cast("Npp32s*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32s_I(@Cast("Npp32s*") int[] pSrcDst, int nLength);

/** 
 * 32-bit floating point signal absolute value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal absolute value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAbs_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAbs_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength);

/** @} signal_abs */

/** 
 * @defgroup signal_square Sqr
 *
 * Squares each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal squared.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal squared.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit complex floating point signal squared.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex floating point signal squared.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength);

/** 
 * 32-bit floating point signal squared.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal squared.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqr_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 32-bit complex floating point signal squared.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_32fc_I(Npp32fc pSrcDst, int nLength);

/** 
 * 64-bit complex floating point signal squared.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_64fc_I(Npp64fc pSrcDst, int nLength);

/** 
 * 8-bit unsigned char signal squared, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal squared, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16u_Sfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal squared, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short signal squared, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_16sc_Sfs(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 8-bit unsigned char signal squared, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_8u_ISfs(@Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_8u_ISfs(@Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_8u_ISfs(@Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal squared, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_16u_ISfs(@Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16u_ISfs(@Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16u_ISfs(@Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal squared, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_16s_ISfs(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16s_ISfs(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqr_16s_ISfs(@Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short signal squared, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqr_16sc_ISfs(Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** @} signal_square */

/** 
 * @defgroup signal_sqrt Sqrt
 *
 * Square root of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal square root.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal square root.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit complex floating point signal square root.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength);

/** 
 * 64-bit complex floating point signal square root.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength);

/** 
 * 32-bit floating point signal square root.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal square root.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsSqrt_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 32-bit complex floating point signal square root.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_32fc_I(Npp32fc pSrcDst, int nLength);

/** 
 * 64-bit complex floating point signal square root.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_64fc_I(Npp64fc pSrcDst, int nLength);

/** 
 * 8-bit unsigned char signal square root, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_8u_Sfs(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_8u_Sfs(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_8u_Sfs(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal square root, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_16u_Sfs(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16u_Sfs(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16u_Sfs(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal square root, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short signal square root, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_16sc_Sfs(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, int nScaleFactor);

/** 
 * 64-bit signed integer signal square root, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_64s_Sfs(@Cast("const Npp64s*") LongPointer pSrc, @Cast("Npp64s*") LongPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_64s_Sfs(@Cast("const Npp64s*") LongBuffer pSrc, @Cast("Npp64s*") LongBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_64s_Sfs(@Cast("const Npp64s*") long[] pSrc, @Cast("Npp64s*") long[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal square root, scale, then clamp to 16-bit signed integer saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_32s16s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_32s16s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_32s16s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 64-bit signed integer signal square root, scale, then clamp to 16-bit signed integer saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_64s16s_Sfs(@Cast("const Npp64s*") LongPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_64s16s_Sfs(@Cast("const Npp64s*") LongBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_64s16s_Sfs(@Cast("const Npp64s*") long[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 8-bit unsigned char signal square root, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_8u_ISfs(@Cast("Npp8u*") BytePointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_8u_ISfs(@Cast("Npp8u*") ByteBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_8u_ISfs(@Cast("Npp8u*") byte[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit unsigned short signal square root, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_16u_ISfs(@Cast("Npp16u*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16u_ISfs(@Cast("Npp16u*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16u_ISfs(@Cast("Npp16u*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal square root, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_16s_ISfs(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16s_ISfs(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_16s_ISfs(@Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 16-bit complex signed short signal square root, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_16sc_ISfs(Npp16sc pSrcDst, int nLength, int nScaleFactor);

/** 
 * 64-bit signed integer signal square root, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSqrt_64s_ISfs(@Cast("Npp64s*") LongPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_64s_ISfs(@Cast("Npp64s*") LongBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsSqrt_64s_ISfs(@Cast("Npp64s*") long[] pSrcDst, int nLength, int nScaleFactor);

/** @} signal_sqrt */

/** 
 * @defgroup signal_cuberoot Cubrt
 *
 * Cube root of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal cube root.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCubrt_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCubrt_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsCubrt_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit signed integer signal cube root, scale, then clamp to 16-bit signed integer saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCubrt_32s16s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsCubrt_32s16s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsCubrt_32s16s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** @} signal_cuberoot */

/** 
 * @defgroup signal_exp Exp
 *
 * E raised to the power of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal exponent.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal exponent.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit floating point signal exponent with 64-bit floating point result.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_32f64f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_32f64f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_32f64f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit floating point signal exponent.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal exponent.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsExp_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 16-bit signed short signal exponent, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal exponent, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 64-bit signed integer signal exponent, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_64s_Sfs(@Cast("const Npp64s*") LongPointer pSrc, @Cast("Npp64s*") LongPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_64s_Sfs(@Cast("const Npp64s*") LongBuffer pSrc, @Cast("Npp64s*") LongBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_64s_Sfs(@Cast("const Npp64s*") long[] pSrc, @Cast("Npp64s*") long[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal exponent, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_16s_ISfs(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_16s_ISfs(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_16s_ISfs(@Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal exponent, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_32s_ISfs(@Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_32s_ISfs(@Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_32s_ISfs(@Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 64-bit signed integer signal exponent, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsExp_64s_ISfs(@Cast("Npp64s*") LongPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_64s_ISfs(@Cast("Npp64s*") LongBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsExp_64s_ISfs(@Cast("Npp64s*") long[] pSrcDst, int nLength, int nScaleFactor);

/** @} signal_exp */

/** 
 * @defgroup signal_ln Ln
 *
 * Natural logarithm of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal natural logarithm.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal natural logarithm.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 64-bit floating point signal natural logarithm with 32-bit floating point result.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_64f32f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_64f32f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_64f32f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 32-bit floating point signal natural logarithm.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal natural logarithm.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLn_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 16-bit signed short signal natural logarithm, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal natural logarithm, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal natural logarithm, scale, then clamp to 16-bit signed short saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_32s16s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_32s16s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_32s16s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, int nScaleFactor);

/** 
 * 16-bit signed short signal natural logarithm, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_16s_ISfs(@Cast("Npp16s*") ShortPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_16s_ISfs(@Cast("Npp16s*") ShortBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_16s_ISfs(@Cast("Npp16s*") short[] pSrcDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal natural logarithm, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLn_32s_ISfs(@Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_32s_ISfs(@Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int nppsLn_32s_ISfs(@Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** @} signal_ln */

/** 
 * @defgroup signal_10log10 10Log10
 *
 * Ten times the decimal logarithm of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit signed integer signal 10 times base 10 logarithm, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int npps10Log10_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int npps10Log10_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int npps10Log10_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength, int nScaleFactor);

/** 
 * 32-bit signed integer signal 10 times base 10 logarithm, scale, then clamp to saturated value.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int npps10Log10_32s_ISfs(@Cast("Npp32s*") IntPointer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int npps10Log10_32s_ISfs(@Cast("Npp32s*") IntBuffer pSrcDst, int nLength, int nScaleFactor);
public static native @Cast("NppStatus") int npps10Log10_32s_ISfs(@Cast("Npp32s*") int[] pSrcDst, int nLength, int nScaleFactor);

/** @} signal_10log10 */

/** 
 * @defgroup signal_sumln SumLn
 *
 * Sums up the natural logarithm of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * Device scratch buffer size (in bytes) for 32f SumLn.
 * This primitive provides the correct buffer size for nppsSumLn_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * 32-bit floating point signal sum natural logarithm.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSumLn_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for 64f SumLn.
 * This primitive provides the correct buffer size for nppsSumLn_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * 64-bit floating point signal sum natural logarithm.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSumLn_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for 32f64f SumLn.
 * This primitive provides the correct buffer size for nppsSumLn_32f64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_32f64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_32f64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_32f64f(int nLength, int[] hpBufferSize);

/** 
 * 32-bit flaoting point input, 64-bit floating point output signal sum natural logarithm.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSumLn_32f64f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_32f64f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_32f64f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for 16s32f SumLn.
 * This primitive provides the correct buffer size for nppsSumLn_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_16s32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_16s32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumLnGetBufferSize_16s32f(int nLength, int[] hpBufferSize);

/** 
 * 16-bit signed short integer input, 32-bit floating point output signal sum natural logarithm.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSumLn_16s32f(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSumLn_16s32f(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32f*") float[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_sumln */

/** 
 * @defgroup signal_inversetan Arctan
 *
 * Inverse tangent of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal inverse tangent.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsArctan_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength);

/** 
 * 64-bit floating point signal inverse tangent.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsArctan_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength);

/** 
 * 32-bit floating point signal inverse tangent.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsArctan_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point signal inverse tangent.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsArctan_64f_I(@Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_64f_I(@Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsArctan_64f_I(@Cast("Npp64f*") double[] pSrcDst, int nLength);

/** @} signal_inversetan */

/** 
 * @defgroup signal_normalize Normalize
 *
 * Normalize each sample of a real or complex signal using offset and division operations.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal normalize.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param vSub value subtracted from each signal element before division
 * \param vDiv divisor of post-subtracted signal element dividend
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormalize_32f(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pDst, int nLength, @Cast("Npp32f") float vSub, @Cast("Npp32f") float vDiv);
public static native @Cast("NppStatus") int nppsNormalize_32f(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pDst, int nLength, @Cast("Npp32f") float vSub, @Cast("Npp32f") float vDiv);
public static native @Cast("NppStatus") int nppsNormalize_32f(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pDst, int nLength, @Cast("Npp32f") float vSub, @Cast("Npp32f") float vDiv);

/** 
 * 32-bit complex floating point signal normalize.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param vSub value subtracted from each signal element before division
 * \param vDiv divisor of post-subtracted signal element dividend
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormalize_32fc(@Const Npp32fc pSrc, Npp32fc pDst, int nLength, @ByVal Npp32fc vSub, @Cast("Npp32f") float vDiv);

/** 
 * 64-bit floating point signal normalize.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param vSub value subtracted from each signal element before division
 * \param vDiv divisor of post-subtracted signal element dividend
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormalize_64f(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pDst, int nLength, @Cast("Npp64f") double vSub, @Cast("Npp64f") double vDiv);
public static native @Cast("NppStatus") int nppsNormalize_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pDst, int nLength, @Cast("Npp64f") double vSub, @Cast("Npp64f") double vDiv);
public static native @Cast("NppStatus") int nppsNormalize_64f(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pDst, int nLength, @Cast("Npp64f") double vSub, @Cast("Npp64f") double vDiv);

/** 
 * 64-bit complex floating point signal normalize.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param vSub value subtracted from each signal element before division
 * \param vDiv divisor of post-subtracted signal element dividend
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormalize_64fc(@Const Npp64fc pSrc, Npp64fc pDst, int nLength, @ByVal Npp64fc vSub, @Cast("Npp64f") double vDiv);

/** 
 * 16-bit signed short signal normalize, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param vSub value subtracted from each signal element before division
 * \param vDiv divisor of post-subtracted signal element dividend
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormalize_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pDst, int nLength, @Cast("Npp16s") short vSub, int vDiv, int nScaleFactor);
public static native @Cast("NppStatus") int nppsNormalize_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pDst, int nLength, @Cast("Npp16s") short vSub, int vDiv, int nScaleFactor);
public static native @Cast("NppStatus") int nppsNormalize_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pDst, int nLength, @Cast("Npp16s") short vSub, int vDiv, int nScaleFactor);

/** 
 * 16-bit complex signed short signal normalize, scale, then clamp to saturated value.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \param vSub value subtracted from each signal element before division
 * \param vDiv divisor of post-subtracted signal element dividend
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormalize_16sc_Sfs(@Const Npp16sc pSrc, Npp16sc pDst, int nLength, @ByVal Npp16sc vSub, int vDiv, int nScaleFactor);

/** @} signal_normalize */

/** 
 * @defgroup signal_cauchy Cauchy, CauchyD, and CauchyDD2
 *
 * Determine Cauchy robust error function and its first and second derivatives for each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 32-bit floating point signal Cauchy error calculation.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nParam constant used in Cauchy formula
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCauchy_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength, @Cast("Npp32f") float nParam);
public static native @Cast("NppStatus") int nppsCauchy_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength, @Cast("Npp32f") float nParam);
public static native @Cast("NppStatus") int nppsCauchy_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength, @Cast("Npp32f") float nParam);

/** 
 * 32-bit floating point signal Cauchy first derivative.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \param nParam constant used in Cauchy formula
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCauchyD_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, int nLength, @Cast("Npp32f") float nParam);
public static native @Cast("NppStatus") int nppsCauchyD_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, int nLength, @Cast("Npp32f") float nParam);
public static native @Cast("NppStatus") int nppsCauchyD_32f_I(@Cast("Npp32f*") float[] pSrcDst, int nLength, @Cast("Npp32f") float nParam);

/** 
 * 32-bit floating point signal Cauchy first and second derivatives.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param pD2FVal \ref source_signal_pointer. This signal contains the second derivative
 *      of the source signal.
 * \param nLength \ref length_specification.
 * \param nParam constant used in Cauchy formula
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCauchyDD2_32f_I(@Cast("Npp32f*") FloatPointer pSrcDst, @Cast("Npp32f*") FloatPointer pD2FVal, int nLength, @Cast("Npp32f") float nParam);
public static native @Cast("NppStatus") int nppsCauchyDD2_32f_I(@Cast("Npp32f*") FloatBuffer pSrcDst, @Cast("Npp32f*") FloatBuffer pD2FVal, int nLength, @Cast("Npp32f") float nParam);
public static native @Cast("NppStatus") int nppsCauchyDD2_32f_I(@Cast("Npp32f*") float[] pSrcDst, @Cast("Npp32f*") float[] pD2FVal, int nLength, @Cast("Npp32f") float nParam);

/** @} signal_cauchy */

/** @} signal_arithmetic_operations */

/** 
 * @defgroup signal_logical_and_shift_operations Logical And Shift Operations
 *
 * @{
 *
 */

/** 
 * @defgroup signal_andc AndC
 *
 * Bitwise AND of a constant and each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal and with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be anded with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAndC_8u(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_8u(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_8u(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal and with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be anded with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAndC_16u(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_16u(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_16u(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal and with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be anded with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAndC_32u(@Cast("const Npp32u*") IntPointer pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_32u(@Cast("const Npp32u*") IntBuffer pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_32u(@Cast("const Npp32u*") int[] pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal and with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be anded with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAndC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal and with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be anded with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAndC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned signed integer in place signal and with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be anded with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAndC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAndC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** @} signal_andc */

/** 
 * @defgroup signal_and And
 *
 * Sample by sample bitwise AND of samples from two signals.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal and with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be anded with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAnd_8u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_8u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_8u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal and with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be anded with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAnd_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal and with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be anded with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAnd_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal and with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be anded with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAnd_8u_I(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_8u_I(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_8u_I(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal and with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be anded with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAnd_16u_I(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_16u_I(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_16u_I(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned integer in place signal and with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be anded with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAnd_32u_I(@Cast("const Npp32u*") IntPointer pSrc, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_32u_I(@Cast("const Npp32u*") IntBuffer pSrc, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsAnd_32u_I(@Cast("const Npp32u*") int[] pSrc, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** @} signal_and */

/** 
 * @defgroup signal_orc OrC
 *
 * Bitwise OR of a constant and each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal or with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be ored with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOrC_8u(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_8u(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_8u(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal or with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be ored with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOrC_16u(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_16u(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_16u(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal or with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be ored with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOrC_32u(@Cast("const Npp32u*") IntPointer pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_32u(@Cast("const Npp32u*") IntBuffer pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_32u(@Cast("const Npp32u*") int[] pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal or with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be ored with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOrC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal or with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be ored with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOrC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned signed integer in place signal or with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be ored with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOrC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOrC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** @} signal_orc */

/** 
 * @defgroup signal_or Or
 *
 * Sample by sample bitwise OR of the samples from two signals.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal or with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be ored with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOr_8u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_8u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_8u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal or with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be ored with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOr_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal or with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be ored with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOr_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal or with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be ored with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOr_8u_I(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_8u_I(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_8u_I(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal or with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be ored with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOr_16u_I(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_16u_I(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_16u_I(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned integer in place signal or with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be ored with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsOr_32u_I(@Cast("const Npp32u*") IntPointer pSrc, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_32u_I(@Cast("const Npp32u*") IntBuffer pSrc, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsOr_32u_I(@Cast("const Npp32u*") int[] pSrc, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** @} signal_or */

/** 
 * @defgroup signal_xorc XorC
 *
 * Bitwise XOR of a constant and each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal exclusive or with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be exclusive ored with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXorC_8u(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_8u(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_8u(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal exclusive or with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be exclusive ored with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXorC_16u(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_16u(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_16u(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal exclusive or with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be exclusive ored with each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXorC_32u(@Cast("const Npp32u*") IntPointer pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_32u(@Cast("const Npp32u*") IntBuffer pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_32u(@Cast("const Npp32u*") int[] pSrc, @Cast("Npp32u") int nValue, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal exclusive or with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be exclusive ored with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXorC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_8u_I(@Cast("Npp8u") byte nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal exclusive or with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be exclusive ored with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXorC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_16u_I(@Cast("Npp16u") short nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned signed integer in place signal exclusive or with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be exclusive ored with each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXorC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXorC_32u_I(@Cast("Npp32u") int nValue, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** @} signal_xorc */

/**
 * @defgroup signal_xor Xor
 *
 * Sample by sample bitwise XOR of the samples from two signals.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal exclusive or with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be exclusive ored with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXor_8u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_8u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_8u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal exclusive or with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be exclusive ored with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXor_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal exclusive or with signal.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer. signal2 elements to be exclusive ored with signal1 elements
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXor_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal exclusive or with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be exclusive ored with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXor_8u_I(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_8u_I(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_8u_I(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal exclusive or with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be exclusive ored with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXor_16u_I(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_16u_I(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_16u_I(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned integer in place signal exclusive or with signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer. signal2 elements to be exclusive ored with signal1 elements
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsXor_32u_I(@Cast("const Npp32u*") IntPointer pSrc, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_32u_I(@Cast("const Npp32u*") IntBuffer pSrc, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsXor_32u_I(@Cast("const Npp32u*") int[] pSrc, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** @} signal_xor */

/** 
 * @defgroup signal_not Not
 *
 * Bitwise NOT of each sample of a signal.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char not signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNot_8u(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_8u(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_8u(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short not signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNot_16u(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_16u(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_16u(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer not signal.
 * \param pSrc \ref source_signal_pointer.
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNot_32u(@Cast("const Npp32u*") IntPointer pSrc, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_32u(@Cast("const Npp32u*") IntBuffer pSrc, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_32u(@Cast("const Npp32u*") int[] pSrc, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place not signal.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNot_8u_I(@Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_8u_I(@Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_8u_I(@Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place not signal.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNot_16u_I(@Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_16u_I(@Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_16u_I(@Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned signed integer in place not signal.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNot_32u_I(@Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_32u_I(@Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsNot_32u_I(@Cast("Npp32u*") int[] pSrcDst, int nLength);

/** @} signal_not */

/** 
 * @defgroup signal_lshiftc LShiftC
 *
 * Left shifts the bits of each sample of a signal by a constant amount.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal left shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_8u(@Cast("const Npp8u*") BytePointer pSrc, int nValue, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_8u(@Cast("const Npp8u*") ByteBuffer pSrc, int nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_8u(@Cast("const Npp8u*") byte[] pSrc, int nValue, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal left shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_16u(@Cast("const Npp16u*") ShortPointer pSrc, int nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16u(@Cast("const Npp16u*") ShortBuffer pSrc, int nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16u(@Cast("const Npp16u*") short[] pSrc, int nValue, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 16-bit signed short signal left shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16s(@Cast("const Npp16s*") short[] pSrc, int nValue, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal left shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_32u(@Cast("const Npp32u*") IntPointer pSrc, int nValue, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32u(@Cast("const Npp32u*") IntBuffer pSrc, int nValue, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32u(@Cast("const Npp32u*") int[] pSrc, int nValue, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 32-bit signed integer signal left shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_32s(@Cast("const Npp32s*") IntPointer pSrc, int nValue, @Cast("Npp32s*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nValue, @Cast("Npp32s*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32s(@Cast("const Npp32s*") int[] pSrc, int nValue, @Cast("Npp32s*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal left shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_8u_I(int nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_8u_I(int nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_8u_I(int nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal left shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_16u_I(int nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16u_I(int nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16u_I(int nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 16-bit signed short in place signal left shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_16s_I(int nValue, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16s_I(int nValue, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_16s_I(int nValue, @Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned signed integer in place signal left shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_32u_I(int nValue, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32u_I(int nValue, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32u_I(int nValue, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** 
 * 32-bit signed signed integer in place signal left shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to left shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsLShiftC_32s_I(int nValue, @Cast("Npp32s*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32s_I(int nValue, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsLShiftC_32s_I(int nValue, @Cast("Npp32s*") int[] pSrcDst, int nLength);

/** @} signal_lshiftc */

/** 
 * @defgroup signal_rshiftc RShiftC
 *
 * Right shifts the bits of each sample of a signal by a constant amount.
 *
 * @{
 *
 */

/** 
 * 8-bit unsigned char signal right shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_8u(@Cast("const Npp8u*") BytePointer pSrc, int nValue, @Cast("Npp8u*") BytePointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_8u(@Cast("const Npp8u*") ByteBuffer pSrc, int nValue, @Cast("Npp8u*") ByteBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_8u(@Cast("const Npp8u*") byte[] pSrc, int nValue, @Cast("Npp8u*") byte[] pDst, int nLength);

/** 
 * 16-bit unsigned short signal right shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_16u(@Cast("const Npp16u*") ShortPointer pSrc, int nValue, @Cast("Npp16u*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16u(@Cast("const Npp16u*") ShortBuffer pSrc, int nValue, @Cast("Npp16u*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16u(@Cast("const Npp16u*") short[] pSrc, int nValue, @Cast("Npp16u*") short[] pDst, int nLength);

/** 
 * 16-bit signed short signal right shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nValue, @Cast("Npp16s*") ShortPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nValue, @Cast("Npp16s*") ShortBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16s(@Cast("const Npp16s*") short[] pSrc, int nValue, @Cast("Npp16s*") short[] pDst, int nLength);

/** 
 * 32-bit unsigned integer signal right shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_32u(@Cast("const Npp32u*") IntPointer pSrc, int nValue, @Cast("Npp32u*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32u(@Cast("const Npp32u*") IntBuffer pSrc, int nValue, @Cast("Npp32u*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32u(@Cast("const Npp32u*") int[] pSrc, int nValue, @Cast("Npp32u*") int[] pDst, int nLength);

/** 
 * 32-bit signed integer signal right shift with constant.
 * \param pSrc \ref source_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param pDst \ref destination_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_32s(@Cast("const Npp32s*") IntPointer pSrc, int nValue, @Cast("Npp32s*") IntPointer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nValue, @Cast("Npp32s*") IntBuffer pDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32s(@Cast("const Npp32s*") int[] pSrc, int nValue, @Cast("Npp32s*") int[] pDst, int nLength);

/** 
 * 8-bit unsigned char in place signal right shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_8u_I(int nValue, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_8u_I(int nValue, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_8u_I(int nValue, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short in place signal right shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_16u_I(int nValue, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16u_I(int nValue, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16u_I(int nValue, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 16-bit signed short in place signal right shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_16s_I(int nValue, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16s_I(int nValue, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_16s_I(int nValue, @Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit unsigned signed integer in place signal right shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_32u_I(int nValue, @Cast("Npp32u*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32u_I(int nValue, @Cast("Npp32u*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32u_I(int nValue, @Cast("Npp32u*") int[] pSrcDst, int nLength);

/** 
 * 32-bit signed signed integer in place signal right shift with constant.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nValue Constant value to be used to right shift each vector element
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsRShiftC_32s_I(int nValue, @Cast("Npp32s*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32s_I(int nValue, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsRShiftC_32s_I(int nValue, @Cast("Npp32s*") int[] pSrcDst, int nLength);

/** @} signal_rshiftc */

/** @} signal_logical_and_shift_operations */

/** @} signal_arithmetic_and_logical_operations */

// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPS_ARITHMETIC_AND_LOGICAL_OPERATIONS_H */


// Parsed from <npps_statistics_functions.h>

 /* Copyright 2010-2014 NVIDIA Corporation.  All rights reserved. 
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
// #ifndef NV_NPPS_STATISTICS_FUNCTIONS_H
// #define NV_NPPS_STATISTICS_FUNCTIONS_H
 
/**
 * \file npps_statistics_functions.h
 * NPP Signal Processing Functionality.
 */
 
// #include "nppdefs.h"


// #ifdef __cplusplus
// #endif


/** @defgroup signal_statistical_functions Statistical Functions
 *  @ingroup npps
 * Functions that provide global signal statistics like: sum, mean, standard
 * deviation, min, max, etc.
 *
 * @{
 *
 */

/** @defgroup signal_min_every_or_max_every MinEvery And MaxEvery Functions
 * Performs the min or max operation on the samples of a signal.
 *
 * @{  
 *
 */

/** 
 * 8-bit in place min value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinEvery_8u_I(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_8u_I(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_8u_I(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short integer in place min value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinEvery_16u_I(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_16u_I(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_16u_I(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 16-bit signed short integer in place min value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinEvery_16s_I(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_16s_I(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_16s_I(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit signed integer in place min value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinEvery_32s_I(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_32s_I(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_32s_I(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pSrcDst, int nLength);

/** 
 * 32-bit floating point in place min value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinEvery_32f_I(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_32f_I(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_32f_I(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 * 64-bit floating point in place min value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinEvery_64f_I(@Cast("const Npp64f*") DoublePointer pSrc, @Cast("Npp64f*") DoublePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_64f_I(@Cast("const Npp64f*") DoubleBuffer pSrc, @Cast("Npp64f*") DoubleBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMinEvery_64f_I(@Cast("const Npp64f*") double[] pSrc, @Cast("Npp64f*") double[] pSrcDst, int nLength);

/** 
 * 8-bit in place max value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxEvery_8u_I(@Cast("const Npp8u*") BytePointer pSrc, @Cast("Npp8u*") BytePointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_8u_I(@Cast("const Npp8u*") ByteBuffer pSrc, @Cast("Npp8u*") ByteBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_8u_I(@Cast("const Npp8u*") byte[] pSrc, @Cast("Npp8u*") byte[] pSrcDst, int nLength);

/** 
 * 16-bit unsigned short integer in place max value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxEvery_16u_I(@Cast("const Npp16u*") ShortPointer pSrc, @Cast("Npp16u*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_16u_I(@Cast("const Npp16u*") ShortBuffer pSrc, @Cast("Npp16u*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_16u_I(@Cast("const Npp16u*") short[] pSrc, @Cast("Npp16u*") short[] pSrcDst, int nLength);

/** 
 * 16-bit signed short integer in place max value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxEvery_16s_I(@Cast("const Npp16s*") ShortPointer pSrc, @Cast("Npp16s*") ShortPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_16s_I(@Cast("const Npp16s*") ShortBuffer pSrc, @Cast("Npp16s*") ShortBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_16s_I(@Cast("const Npp16s*") short[] pSrc, @Cast("Npp16s*") short[] pSrcDst, int nLength);

/** 
 * 32-bit signed integer in place max value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxEvery_32s_I(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_32s_I(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_32s_I(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pSrcDst, int nLength);

/** 
 * 32-bit floating point in place max value for each pair of elements.
 * \param pSrc \ref source_signal_pointer.
 * \param pSrcDst \ref in_place_signal_pointer.
 * \param nLength \ref length_specification.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxEvery_32f_I(@Cast("const Npp32f*") FloatPointer pSrc, @Cast("Npp32f*") FloatPointer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_32f_I(@Cast("const Npp32f*") FloatBuffer pSrc, @Cast("Npp32f*") FloatBuffer pSrcDst, int nLength);
public static native @Cast("NppStatus") int nppsMaxEvery_32f_I(@Cast("const Npp32f*") float[] pSrc, @Cast("Npp32f*") float[] pSrcDst, int nLength);

/** 
 *
 * @} signal_min_every_or_max_every
 *
 */

/** @defgroup signal_sum Sum
 *
 * @{  
 *
 */
 
 /** 
 * Device scratch buffer size (in bytes) for nppsSum_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsSum_32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32fc(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32fc(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32fc(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsSum_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsSum_64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_64fc(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_64fc(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_64fc(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsSum_16s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsSum_16sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16sc_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16sc_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16sc_Sfs(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsSum_16sc32sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16sc32sc_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16sc32sc_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16sc32sc_Sfs(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsSum_32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_32s_Sfs(int nLength, int[] hpBufferSize);
 
/** 
 * Device scratch buffer size (in bytes) for nppsSum_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16s32s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16s32s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsSumGetBufferSize_16s32s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * 32-bit float vector sum method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pSum, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pSum, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pSum, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit float complex vector sum method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_32fc(@Const Npp32fc pSrc, int nLength, Npp32fc pSum, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_32fc(@Const Npp32fc pSrc, int nLength, Npp32fc pSum, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_32fc(@Const Npp32fc pSrc, int nLength, Npp32fc pSum, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit double vector sum method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pSum, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pSum, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pSum, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit double complex vector sum method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_64fc(@Const Npp64fc pSrc, int nLength, Npp64fc pSum, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_64fc(@Const Npp64fc pSrc, int nLength, Npp64fc pSum, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_64fc(@Const Npp64fc pSrc, int nLength, Npp64fc pSum, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit short vector sum with integer scaling method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_16s_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pSum, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pSum, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pSum, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector sum with integer scaling method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_32s_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pSum, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pSum, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pSum, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit short complex vector sum with integer scaling method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_16sc_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_16sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp16sc pSum, int nScaleFactor, 
                 @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp16sc pSum, int nScaleFactor, 
                 @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp16sc pSum, int nScaleFactor, 
                 @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit short complex vector sum (32bit int complex) with integer scaling
 * method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_16sc32sc_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_16sc32sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp32sc pSum, int nScaleFactor, 
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16sc32sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp32sc pSum, int nScaleFactor, 
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16sc32sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp32sc pSum, int nScaleFactor, 
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit integer vector sum (32bit) with integer scaling method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pSum Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsSumGetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsSum_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pSum, int nScaleFactor,
                   @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pSum, int nScaleFactor,
                   @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsSum_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32s*") int[] pSum, int nScaleFactor,
                   @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_sum */


/** @defgroup signal_max Maximum
 *
 * @{
 *
 */

/** 
 * Device scratch buffer size (in bytes) for nppsMax_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMax_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMax_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMax_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMax_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMax, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMax, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMax, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMax_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMax, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMax, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMax, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit float vector max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMax_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMax, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMax, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMax, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit float vector max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMax_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMax, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMax, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMax_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMax, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxIndx_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxIndx_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxIndx_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxIndx_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxIndxGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector max index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pIndx Pointer to the index value of the first maximum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxIndxGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxIndx_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMax, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMax, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMax, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector max index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pIndx Pointer to the index value of the first maximum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxIndxGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxIndx_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMax, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMax, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMax, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit float vector max index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pIndx Pointer to the index value of the first maximum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxIndxGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxIndx_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMax, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMax, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMax, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit float vector max index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMax Pointer to the output result.
 * \param pIndx Pointer to the index value of the first maximum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxIndxGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxIndx_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMax, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMax, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxIndx_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMax, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxAbs_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxAbsGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxAbs_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxAbsGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector max absolute method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMaxAbs Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxAbsGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxAbs_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMaxAbs, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbs_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMaxAbs, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbs_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMaxAbs, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector max absolute method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMaxAbs Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxAbsGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxAbs_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMaxAbs, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbs_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMaxAbs, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbs_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMaxAbs, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxAbsIndx_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxAbsIndxGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsIndxGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsIndxGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMaxAbsIndx_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaxAbsIndxGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsIndxGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaxAbsIndxGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector max absolute index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMaxAbs Pointer to the output result.
 * \param pIndx Pointer to the index value of the first maximum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxAbsIndxGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxAbsIndx_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMaxAbs, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbsIndx_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMaxAbs, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbsIndx_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMaxAbs, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector max absolute index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMaxAbs Pointer to the output result.
 * \param pIndx Pointer to the index value of the first maximum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaxAbsIndxGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaxAbsIndx_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMaxAbs, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbsIndx_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMaxAbs, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaxAbsIndx_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMaxAbs, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_max */

/** @defgroup signal_min Minimum
 *
 * @{
 *
 */

/** 
 * Device scratch buffer size (in bytes) for nppsMin_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMin_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMin_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMin_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector min method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMin_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMin, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMin, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMin, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector min method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMin_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMin, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMin, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMin, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector min method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMin_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMin, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMin, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMin, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit integer vector min method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMin_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMin, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMin, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMin_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMin, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for nppsMinIndx_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMinIndx_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMinIndx_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMinIndx_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinIndxGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector min index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pIndx Pointer to the index value of the first minimum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinIndxGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinIndx_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMin, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMin, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMin, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector min index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pIndx Pointer to the index value of the first minimum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinIndxGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinIndx_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMin, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMin, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMin, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit float vector min index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pIndx Pointer to the index value of the first minimum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinIndxGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinIndx_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMin, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMin, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMin, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit float vector min index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the output result.
 * \param pIndx Pointer to the index value of the first minimum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinIndxGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinIndx_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMin, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMin, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinIndx_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMin, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for nppsMinAbs_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinAbsGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMinAbs_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinAbsGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector min absolute method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMinAbs Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinAbsGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinAbs_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMinAbs, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbs_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMinAbs, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbs_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMinAbs, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector min absolute method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMinAbs Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinAbsGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinAbs_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMinAbs, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbs_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMinAbs, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbs_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMinAbs, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device scratch buffer size (in bytes) for nppsMinAbsIndx_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinAbsIndxGetBufferSize_16s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsIndxGetBufferSize_16s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsIndxGetBufferSize_16s(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMinAbsIndx_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinAbsIndxGetBufferSize_32s(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsIndxGetBufferSize_32s(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinAbsIndxGetBufferSize_32s(int nLength, int[] hpBufferSize);

/** 
 * 16-bit integer vector min absolute index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMinAbs Pointer to the output result.
 * \param pIndx Pointer to the index value of the first minimum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinAbsIndxGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinAbsIndx_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMinAbs, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbsIndx_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMinAbs, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbsIndx_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMinAbs, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector min absolute index method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMinAbs Pointer to the output result.
 * \param pIndx Pointer to the index value of the first minimum element.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinAbsIndxGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinAbsIndx_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMinAbs, IntPointer pIndx, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbsIndx_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMinAbs, IntBuffer pIndx, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinAbsIndx_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMinAbs, int[] pIndx, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_min */

/** @defgroup signal_mean Mean
 *
 * @{
 *
 */

/** 
 * Device scratch buffer size (in bytes) for nppsMean_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMean_32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32fc(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32fc(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32fc(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMean_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMean_64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_64fc(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_64fc(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_64fc(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMean_16s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_16s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_16s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_16s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMean_32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_32s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMean_16sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_16sc_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_16sc_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanGetBufferSize_16sc_Sfs(int nLength, int[] hpBufferSize);

/** 
 * 32-bit float vector mean method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMean_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMean, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMean, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMean, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit float complex vector mean method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanGetBufferSize_32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMean_32fc(@Const Npp32fc pSrc, int nLength, Npp32fc pMean, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_32fc(@Const Npp32fc pSrc, int nLength, Npp32fc pMean, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_32fc(@Const Npp32fc pSrc, int nLength, Npp32fc pMean, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit double vector mean method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMean_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMean, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMean, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMean, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit double complex vector mean method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanGetBufferSize_64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMean_64fc(@Const Npp64fc pSrc, int nLength, Npp64fc pMean, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_64fc(@Const Npp64fc pSrc, int nLength, Npp64fc pMean, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_64fc(@Const Npp64fc pSrc, int nLength, Npp64fc pMean, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit short vector mean with integer scaling method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanGetBufferSize_16s_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMean_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMean, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMean, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMean, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit integer vector mean with integer scaling method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanGetBufferSize_32s_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMean_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMean, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMean, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_32s_Sfs(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMean, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit short complex vector mean with integer scaling method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanGetBufferSize_16sc_Sfs to determine the minium number of bytes required.
 * \param nScaleFactor \ref integer_result_scaling.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMean_16sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp16sc pMean, int nScaleFactor, 
                 @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_16sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp16sc pMean, int nScaleFactor, 
                 @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMean_16sc_Sfs(@Const Npp16sc pSrc, int nLength, Npp16sc pMean, int nScaleFactor, 
                 @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_mean */

/** @defgroup signal_standard_deviation Standard Deviation
 *
 * @{
 *
 */

/** 
 * Device scratch buffer size (in bytes) for nppsStdDev_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsStdDev_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsStdDev_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_16s32s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_16s32s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_16s32s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsStdDev_16s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_16s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_16s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsStdDevGetBufferSize_16s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * 32-bit float vector standard deviation method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pStdDev Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsStdDevGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsStdDev_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pStdDev, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pStdDev, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pStdDev, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit float vector standard deviation method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pStdDev Pointer to the output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsStdDevGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsStdDev_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pStdDev, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pStdDev, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pStdDev, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit float vector standard deviation method (return value is 32-bit)
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pStdDev Pointer to the output result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsStdDevGetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsStdDev_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32s*") int[] pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit float vector standard deviation method (return value is also 16-bit)
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pStdDev Pointer to the output result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsStdDevGetBufferSize_16s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsStdDev_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsStdDev_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_standard_deviation */

/** @defgroup signal_mean_and_standard_deviation Mean And Standard Deviation
 *
 * @{
 *
 */

/** 
 * Device scratch buffer size (in bytes) for nppsMeanStdDev_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMeanStdDev_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_64f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_64f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_64f(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMeanStdDev_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_16s32s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_16s32s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_16s32s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * Device scratch buffer size (in bytes) for nppsMeanStdDev_16s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size. Important: hpBufferSize is a 
 *        <em>host pointer.</em> \ref general_scratch_buffer.
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_16s_Sfs(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_16s_Sfs(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMeanStdDevGetBufferSize_16s_Sfs(int nLength, int[] hpBufferSize);

/** 
 * 32-bit float vector mean and standard deviation method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output mean value.
 * \param pStdDev Pointer to the output standard deviation value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanStdDevGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMeanStdDev_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMean, @Cast("Npp32f*") FloatPointer pStdDev, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMean, @Cast("Npp32f*") FloatBuffer pStdDev, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMean, @Cast("Npp32f*") float[] pStdDev, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit float vector mean and standard deviation method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output mean value.
 * \param pStdDev Pointer to the output standard deviation value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanStdDevGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMeanStdDev_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMean, @Cast("Npp64f*") DoublePointer pStdDev, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMean, @Cast("Npp64f*") DoubleBuffer pStdDev, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMean, @Cast("Npp64f*") double[] pStdDev, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit float vector mean and standard deviation method (return values are 32-bit)
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output mean value.
 * \param pStdDev Pointer to the output standard deviation value.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanStdDevGetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMeanStdDev_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMean, @Cast("Npp32s*") IntPointer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMean, @Cast("Npp32s*") IntBuffer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32s*") int[] pMean, @Cast("Npp32s*") int[] pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit float vector mean and standard deviation method (return values are also 16-bit)
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMean Pointer to the output mean value.
 * \param pStdDev Pointer to the output standard deviation value.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMeanStdDevGetBufferSize_16s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMeanStdDev_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMean, @Cast("Npp16s*") ShortPointer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMean, @Cast("Npp16s*") ShortBuffer pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMeanStdDev_16s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMean, @Cast("Npp16s*") short[] pStdDev, int nScaleFactor, 
            @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_mean_and_standard_deviation */

/** @defgroup signal_min_max Minimum_Maximum
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsMinMax_8u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_8u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_8u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_8u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMax_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_16s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_16s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_16s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMax_16u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_16u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_16u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_16u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMax_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMax_32u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMax_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMax_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 8-bit char vector min and max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMax Pointer to the max output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxGetBufferSize_8u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMax_8u(@Cast("const Npp8u*") BytePointer pSrc, int nLength, @Cast("Npp8u*") BytePointer pMin, @Cast("Npp8u*") BytePointer pMax, 
              @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_8u(@Cast("const Npp8u*") ByteBuffer pSrc, int nLength, @Cast("Npp8u*") ByteBuffer pMin, @Cast("Npp8u*") ByteBuffer pMax, 
              @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_8u(@Cast("const Npp8u*") byte[] pSrc, int nLength, @Cast("Npp8u*") byte[] pMin, @Cast("Npp8u*") byte[] pMax, 
              @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit signed short vector min and max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMax Pointer to the max output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMax_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMin, @Cast("Npp16s*") ShortPointer pMax, 
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMin, @Cast("Npp16s*") ShortBuffer pMax, 
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMin, @Cast("Npp16s*") short[] pMax, 
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short vector min and max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMax Pointer to the max output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxGetBufferSize_16u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMax_16u(@Cast("const Npp16u*") ShortPointer pSrc, int nLength, @Cast("Npp16u*") ShortPointer pMin, @Cast("Npp16u*") ShortPointer pMax, 
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_16u(@Cast("const Npp16u*") ShortBuffer pSrc, int nLength, @Cast("Npp16u*") ShortBuffer pMin, @Cast("Npp16u*") ShortBuffer pMax, 
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_16u(@Cast("const Npp16u*") short[] pSrc, int nLength, @Cast("Npp16u*") short[] pMin, @Cast("Npp16u*") short[] pMax, 
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned int vector min and max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMax Pointer to the max output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxGetBufferSize_32u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMax_32u(@Cast("const Npp32u*") IntPointer pSrc, int nLength, @Cast("Npp32u*") IntPointer pMin, @Cast("Npp32u*") IntPointer pMax, 
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_32u(@Cast("const Npp32u*") IntBuffer pSrc, int nLength, @Cast("Npp32u*") IntBuffer pMin, @Cast("Npp32u*") IntBuffer pMax, 
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_32u(@Cast("const Npp32u*") int[] pSrc, int nLength, @Cast("Npp32u*") int[] pMin, @Cast("Npp32u*") int[] pMax, 
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit signed int vector min and max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMax Pointer to the max output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMax_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMin, @Cast("Npp32s*") IntPointer pMax, 
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMin, @Cast("Npp32s*") IntBuffer pMax, 
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMin, @Cast("Npp32s*") int[] pMax, 
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit float vector min and max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMax Pointer to the max output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMax_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMin, @Cast("Npp32f*") FloatPointer pMax, 
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMin, @Cast("Npp32f*") FloatBuffer pMax, 
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMin, @Cast("Npp32f*") float[] pMax, 
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit double vector min and max method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMax Pointer to the max output result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMax_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMin, @Cast("Npp64f*") DoublePointer pMax, 
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMin, @Cast("Npp64f*") DoubleBuffer pMax, 
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMax_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMin, @Cast("Npp64f*") double[] pMax, 
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsMinMaxIndx_8u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_8u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_8u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_8u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMaxIndx_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_16s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_16s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_16s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMaxIndx_16u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_16u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_16u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_16u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMaxIndx_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMaxIndx_32u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMaxIndx_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMinMaxIndx_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMinMaxIndxGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 8-bit char vector min and max with indices method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMinIndx Pointer to the index of the first min value.
 * \param pMax Pointer to the max output result.
 * \param pMaxIndx Pointer to the index of the first max value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxIndxGetBufferSize_8u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMaxIndx_8u(@Cast("const Npp8u*") BytePointer pSrc, int nLength, @Cast("Npp8u*") BytePointer pMin, IntPointer pMinIndx, @Cast("Npp8u*") BytePointer pMax, IntPointer pMaxIndx,
              @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_8u(@Cast("const Npp8u*") ByteBuffer pSrc, int nLength, @Cast("Npp8u*") ByteBuffer pMin, IntBuffer pMinIndx, @Cast("Npp8u*") ByteBuffer pMax, IntBuffer pMaxIndx,
              @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_8u(@Cast("const Npp8u*") byte[] pSrc, int nLength, @Cast("Npp8u*") byte[] pMin, int[] pMinIndx, @Cast("Npp8u*") byte[] pMax, int[] pMaxIndx,
              @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit signed short vector min and max with indices method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMinIndx Pointer to the index of the first min value.
 * \param pMax Pointer to the max output result.
 * \param pMaxIndx Pointer to the index of the first max value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxIndxGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMaxIndx_16s(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp16s*") ShortPointer pMin, IntPointer pMinIndx, @Cast("Npp16s*") ShortPointer pMax, IntPointer pMaxIndx,
              @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_16s(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp16s*") ShortBuffer pMin, IntBuffer pMinIndx, @Cast("Npp16s*") ShortBuffer pMax, IntBuffer pMaxIndx,
              @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_16s(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp16s*") short[] pMin, int[] pMinIndx, @Cast("Npp16s*") short[] pMax, int[] pMaxIndx,
              @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short vector min and max with indices method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMinIndx Pointer to the index of the first min value.
 * \param pMax Pointer to the max output result.
 * \param pMaxIndx Pointer to the index of the first max value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxIndxGetBufferSize_16u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMaxIndx_16u(@Cast("const Npp16u*") ShortPointer pSrc, int nLength, @Cast("Npp16u*") ShortPointer pMin, IntPointer pMinIndx, @Cast("Npp16u*") ShortPointer pMax, IntPointer pMaxIndx,
              @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_16u(@Cast("const Npp16u*") ShortBuffer pSrc, int nLength, @Cast("Npp16u*") ShortBuffer pMin, IntBuffer pMinIndx, @Cast("Npp16u*") ShortBuffer pMax, IntBuffer pMaxIndx,
              @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_16u(@Cast("const Npp16u*") short[] pSrc, int nLength, @Cast("Npp16u*") short[] pMin, int[] pMinIndx, @Cast("Npp16u*") short[] pMax, int[] pMaxIndx,
              @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit signed short vector min and max with indices method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMinIndx Pointer to the index of the first min value.
 * \param pMax Pointer to the max output result.
 * \param pMaxIndx Pointer to the index of the first max value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxIndxGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMaxIndx_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pMin, IntPointer pMinIndx, @Cast("Npp32s*") IntPointer pMax, IntPointer pMaxIndx,
              @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pMin, IntBuffer pMinIndx, @Cast("Npp32s*") IntBuffer pMax, IntBuffer pMaxIndx,
              @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, @Cast("Npp32s*") int[] pMin, int[] pMinIndx, @Cast("Npp32s*") int[] pMax, int[] pMaxIndx,
              @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short vector min and max with indices method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMinIndx Pointer to the index of the first min value.
 * \param pMax Pointer to the max output result.
 * \param pMaxIndx Pointer to the index of the first max value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxIndxGetBufferSize_32u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMaxIndx_32u(@Cast("const Npp32u*") IntPointer pSrc, int nLength, @Cast("Npp32u*") IntPointer pMin, IntPointer pMinIndx, @Cast("Npp32u*") IntPointer pMax, IntPointer pMaxIndx,
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_32u(@Cast("const Npp32u*") IntBuffer pSrc, int nLength, @Cast("Npp32u*") IntBuffer pMin, IntBuffer pMinIndx, @Cast("Npp32u*") IntBuffer pMax, IntBuffer pMaxIndx,
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_32u(@Cast("const Npp32u*") int[] pSrc, int nLength, @Cast("Npp32u*") int[] pMin, int[] pMinIndx, @Cast("Npp32u*") int[] pMax, int[] pMaxIndx,
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit float vector min and max with indices method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMinIndx Pointer to the index of the first min value.
 * \param pMax Pointer to the max output result.
 * \param pMaxIndx Pointer to the index of the first max value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxIndxGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMaxIndx_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pMin, IntPointer pMinIndx, @Cast("Npp32f*") FloatPointer pMax, IntPointer pMaxIndx,
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pMin, IntBuffer pMinIndx, @Cast("Npp32f*") FloatBuffer pMax, IntBuffer pMaxIndx,
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pMin, int[] pMinIndx, @Cast("Npp32f*") float[] pMax, int[] pMaxIndx,
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit float vector min and max with indices method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pMin Pointer to the min output result.
 * \param pMinIndx Pointer to the index of the first min value.
 * \param pMax Pointer to the max output result.
 * \param pMaxIndx Pointer to the index of the first max value.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMinMaxIndxGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMinMaxIndx_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pMin, IntPointer pMinIndx, @Cast("Npp64f*") DoublePointer pMax, IntPointer pMaxIndx, 
               @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pMin, IntBuffer pMinIndx, @Cast("Npp64f*") DoubleBuffer pMax, IntBuffer pMaxIndx, 
               @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMinMaxIndx_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pMin, int[] pMinIndx, @Cast("Npp64f*") double[] pMax, int[] pMaxIndx, 
               @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_min_max */

/** @defgroup signal_infinity_norm Infinity Norm
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsNorm_Inf_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float vector C norm method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormInfGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_Inf_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                 @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                 @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pNorm,
                 @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_Inf_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float vector C norm method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormInfGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_Inf_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                 @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                 @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                 @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_Inf_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_16s32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_16s32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_16s32f(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector C norm method, return value is 32-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormInfGetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_Inf_16s32f(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_16s32f(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32f*") float[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_Inf_32fc32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_32fc32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_32fc32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_32fc32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex vector C norm method, return value is 32-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormInfGetBufferSize_32fc32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_Inf_32fc32f(@Const Npp32fc pSrc, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_32fc32f(@Const Npp32fc pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_32fc32f(@Const Npp32fc pSrc, int nLength, @Cast("Npp32f*") float[] pNorm,
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_Inf_64fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_64fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_64fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_64fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float complex vector C norm method, return value is 64-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormInfGetBufferSize_64fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_Inf_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_Inf_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_16s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_16s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormInfGetBufferSize_16s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector C norm method, return value is 32-bit signed integer.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormInfGetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_Inf_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pNorm, int nScaleFactor,
                        @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pNorm, int nScaleFactor,
                        @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_Inf_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32s*") int[] pNorm, int nScaleFactor,
                        @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_infinity_norm */

/** @defgroup signal_L1_norm L1 Norm
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsNorm_L1_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float vector L1 norm method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL1GetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L1_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pNorm,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L1_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float vector L1 norm method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL1GetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L1_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L1_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s32f(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector L1 norm method, return value is 32-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the L1 norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL1GetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L1_16s32f(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                   @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                   @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_16s32f(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32f*") float[] pNorm,
                   @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L1_32fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_32fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_32fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_32fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex vector L1 norm method, return value is 64-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL1GetBufferSize_32fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L1_32fc64f(@Const Npp32fc pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_32fc64f(@Const Npp32fc pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_32fc64f(@Const Npp32fc pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L1_64fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_64fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_64fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_64fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float complex vector L1 norm method, return value is 64-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL1GetBufferSize_64fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L1_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L1_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector L1 norm method, return value is 32-bit signed integer.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL1GetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L1_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32s*") int[] pNorm, int nScaleFactor,
                       @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L1_16s64s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s64s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s64s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL1GetBufferSize_16s64s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector L1 norm method, return value is 64-bit signed integer.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL1GetBufferSize_16s64s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L1_16s64s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp64s*") LongPointer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_16s64s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp64s*") LongBuffer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L1_16s64s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp64s*") long[] pNorm, int nScaleFactor,
                       @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_L1_norm */

/** @defgroup signal_L2_norm L2 Norm
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsNorm_L2_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float vector L2 norm method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL2GetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L2_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pNorm, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pNorm, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pNorm, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L2_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float vector L2 norm method
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL2GetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L2_64f(@Cast("const Npp64f*") DoublePointer pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_64f(@Cast("const Npp64f*") DoubleBuffer pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_64f(@Cast("const Npp64f*") double[] pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L2_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_16s32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_16s32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_16s32f(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector L2 norm method, return value is 32-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL2GetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L2_16s32f(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                   @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                   @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_16s32f(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32f*") float[] pNorm,
                   @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L2_32fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_32fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_32fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_32fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex vector L2 norm method, return value is 64-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL2GetBufferSize_32fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L2_32fc64f(@Const Npp32fc pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_32fc64f(@Const Npp32fc pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_32fc64f(@Const Npp32fc pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L2_64fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_64fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_64fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_64fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float complex vector L2 norm method, return value is 64-bit float.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL2GetBufferSize_64fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L2_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_64fc64f(@Const Npp64fc pSrc, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L2_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_16s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_16s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2GetBufferSize_16s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector L2 norm method, return value is 32-bit signed integer.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL2GetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L2_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32s*") IntPointer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32s*") IntBuffer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32s*") int[] pNorm, int nScaleFactor,
                       @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNorm_L2Sqr_16s64s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormL2SqrGetBufferSize_16s64s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2SqrGetBufferSize_16s64s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormL2SqrGetBufferSize_16s64s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer vector L2 Square norm method, return value is 64-bit signed integer.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormL2SqrGetBufferSize_16s64s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNorm_L2Sqr_16s64s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp64s*") LongPointer pNorm, int nScaleFactor,
                          @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2Sqr_16s64s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp64s*") LongBuffer pNorm, int nScaleFactor,
                          @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNorm_L2Sqr_16s64s_Sfs(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp64s*") long[] pNorm, int nScaleFactor,
                          @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_L2_norm */

/** @defgroup signal_infinity_norm_diff Infinity Norm Diff
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_Inf_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float C norm method on two vectors' difference
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffInfGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_Inf_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                 @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                 @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp32f*") float[] pNorm,
                 @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_Inf_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float C norm method on two vectors' difference
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffInfGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_Inf_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                 @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                 @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                 @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_Inf_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_16s32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_16s32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_16s32f(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer C norm method on two vectors' difference, return value is 32-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffInfGetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_Inf_16s32f(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_16s32f(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32f*") float[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_Inf_32fc32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_32fc32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_32fc32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_32fc32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex C norm method on two vectors' difference, return value is 32-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffInfGetBufferSize_32fc32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_Inf_32fc32f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_32fc32f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_32fc32f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp32f*") float[] pNorm,
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_Inf_64fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_64fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_64fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_64fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float complex C norm method on two vectors' difference, return value is 64-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffInfGetBufferSize_64fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_Inf_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_Inf_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_16s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_16s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffInfGetBufferSize_16s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer C norm method on two vectors' difference, return value is 32-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffInfGetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_Inf_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32s*") IntPointer pNorm, int nScaleFactor,
                        @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32s*") IntBuffer pNorm, int nScaleFactor,
                        @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_Inf_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32s*") int[] pNorm, int nScaleFactor,
                        @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_infinity_norm_diff */

/** @defgroup signal_L1_norm_diff L1 Norm Diff
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L1_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float L1 norm method on two vectors' difference
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL1GetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L1_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp32f*") float[] pNorm,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L1_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float L1 norm method on two vectors' difference
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL1GetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L1_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L1_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s32f(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer L1 norm method on two vectors' difference, return value is 32-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the L1 norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL1GetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s32f(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                   @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                   @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s32f(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32f*") float[] pNorm,
                   @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L1_32fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_32fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_32fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_32fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex L1 norm method on two vectors' difference, return value is 64-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL1GetBufferSize_32fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L1_32fc64f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_32fc64f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_32fc64f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L1_64fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_64fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_64fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_64fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float complex L1 norm method on two vectors' difference, return value is 64-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL1GetBufferSize_64fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L1_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L1_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer L1 norm method on two vectors' difference, return value is 32-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer..
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL1GetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32s*") IntPointer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32s*") IntBuffer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32s*") int[] pNorm, int nScaleFactor,
                       @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L1_16s64s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s64s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s64s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL1GetBufferSize_16s64s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer L1 norm method on two vectors' difference, return value is 64-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL1GetBufferSize_16s64s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s64s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp64s*") LongPointer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s64s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp64s*") LongBuffer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L1_16s64s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp64s*") long[] pNorm, int nScaleFactor,
                       @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_L1_norm_diff */

/** @defgroup signal_L2_norm_diff L2 Norm Diff
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L2_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float L2 norm method on two vectors' difference
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL2GetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L2_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp32f*") float[] pNorm,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L2_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float L2 norm method on two vectors' difference
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL2GetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L2_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L2_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_16s32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_16s32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_16s32f(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer L2 norm method on two vectors' difference, return value is 32-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL2GetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L2_16s32f(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pNorm,
                   @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pNorm,
                   @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_16s32f(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32f*") float[] pNorm,
                   @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L2_32fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_32fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_32fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_32fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex L2 norm method on two vectors' difference, return value is 64-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL2GetBufferSize_32fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L2_32fc64f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_32fc64f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_32fc64f(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L2_64fc64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_64fc64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_64fc64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_64fc64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float complex L2 norm method on two vectors' difference, return value is 64-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL2GetBufferSize_64fc64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L2_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pNorm,
                    @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pNorm,
                    @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_64fc64f(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") double[] pNorm,
                    @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L2_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_16s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_16s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2GetBufferSize_16s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer L2 norm method on two vectors' difference, return value is 32-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL2GetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L2_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32s*") IntPointer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32s*") IntBuffer pNorm, int nScaleFactor,
                       @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32s*") int[] pNorm, int nScaleFactor,
                       @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsNormDiff_L2Sqr_16s64s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsNormDiffL2SqrGetBufferSize_16s64s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2SqrGetBufferSize_16s64s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsNormDiffL2SqrGetBufferSize_16s64s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer L2 Square norm method on two vectors' difference, return value is 64-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pNorm Pointer to the norm result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsNormDiffL2SqrGetBufferSize_16s64s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsNormDiff_L2Sqr_16s64s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp64s*") LongPointer pNorm, int nScaleFactor,
                          @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2Sqr_16s64s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp64s*") LongBuffer pNorm, int nScaleFactor,
                          @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsNormDiff_L2Sqr_16s64s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp64s*") long[] pNorm, int nScaleFactor,
                          @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_l2_norm_diff */

/** @defgroup signal_dot_product Dot Product
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float dot product method, return value is 32-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp32f*") float[] pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32fc(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex dot product method, return value is 32-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32f32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f32fc(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float and 32-bit float complex dot product method, return value is 32-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32f32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32f32fc(@Cast("const Npp32f*") FloatPointer pSrc1, @Const Npp32fc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f32fc(@Cast("const Npp32f*") FloatBuffer pSrc1, @Const Npp32fc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f32fc(@Cast("const Npp32f*") float[] pSrc1, @Const Npp32fc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32f64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f64f(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float dot product method, return value is 64-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32f64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32f64f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f64f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f64f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32fc64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32fc64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32fc64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32fc64fc(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float complex dot product method, return value is 64-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32fc64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32fc64fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32fc64fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32fc64fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32f32fc64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f32fc64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f32fc64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32f32fc64fc(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit float and 32-bit float complex dot product method, return value is 64-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32f32fc64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32f32fc64fc(@Cast("const Npp32f*") FloatPointer pSrc1, @Const Npp32fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f32fc64fc(@Cast("const Npp32f*") FloatBuffer pSrc1, @Const Npp32fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32f32fc64fc(@Cast("const Npp32f*") float[] pSrc1, @Const Npp32fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float dot product method, return value is 64-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64fc(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float complex dot product method, return value is 64-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_64f64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64f64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64f64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_64f64fc(int nLength,  int[] hpBufferSize);

/** 
 * 64-bit float and 64-bit float complex dot product method, return value is 64-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_64f64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_64f64fc(@Cast("const Npp64f*") DoublePointer pSrc1, @Const Npp64fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_64f64fc(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Const Npp64fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_64f64fc(@Cast("const Npp64f*") double[] pSrc1, @Const Npp64fc pSrc2, int nLength, Npp64fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s64s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s64s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s64s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s64s(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer dot product method, return value is 64-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s64s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s64s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp64s*") LongPointer pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s64s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp64s*") LongBuffer pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s64s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp64s*") long[] pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16sc64sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc64sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc64sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc64sc(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer complex dot product method, return value is 64-bit signed integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16sc64sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16sc64sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp64sc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc64sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp64sc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc64sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp64sc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s16sc64sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc64sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc64sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc64sc(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer and 16-bit signed short integer short dot product method, return value is 64-bit signed integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s16sc64sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s16sc64sc(@Cast("const Npp16s*") ShortPointer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp64sc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc64sc(@Cast("const Npp16s*") ShortBuffer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp64sc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc64sc(@Cast("const Npp16s*") short[] pSrc1, @Const Npp16sc pSrc2, int nLength, Npp64sc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32f(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer dot product method, return value is 32-bit float.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s32f(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32f*") FloatPointer pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32f*") FloatBuffer pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s32f(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32f*") float[] pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16sc32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc32fc(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer complex dot product method, return value is 32-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16sc32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16sc32fc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc32fc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc32fc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s16sc32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc32fc(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer and 16-bit signed short integer complex dot product method, return value is 32-bit float complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s16sc32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s16sc32fc(@Cast("const Npp16s*") ShortPointer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc32fc(@Cast("const Npp16s*") ShortBuffer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc32fc(@Cast("const Npp16s*") short[] pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32fc pDp,
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer dot product method, return value is 16-bit signed short integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp16s*") ShortPointer pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp16s*") ShortBuffer pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp16s*") short[] pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer complex dot product method, return value is 16-bit signed short integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16sc_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp16sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp16sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp16sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit signed integer dot product method, return value is 32-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32s_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, int nLength, @Cast("Npp32s*") IntPointer pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32s_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, int nLength, @Cast("Npp32s*") IntBuffer pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32s_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, int nLength, @Cast("Npp32s*") int[] pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32sc_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32sc_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32sc_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit signed integer complex dot product method, return value is 32-bit signed integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32sc_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32sc_Sfs(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32sc_Sfs(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32sc_Sfs(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer dot product method, return value is 32-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result. 
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp32s*") IntPointer pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp32s*") IntBuffer pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s32s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp32s*") int[] pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s16sc32sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc32sc_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc32sc_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc32sc_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer and 16-bit signed short integer complex dot product method, return value is 32-bit signed integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s16sc32sc_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s16sc32sc_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc32sc_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc32sc_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s32s32s_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32s32s_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32s32s_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s32s32s_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer and 32-bit signed integer dot product method, return value is 32-bit signed integer.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s32s32s_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s32s32s_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, int nLength, @Cast("Npp32s*") IntPointer pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s32s32s_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, int nLength, @Cast("Npp32s*") IntBuffer pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s32s32s_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, int nLength, @Cast("Npp32s*") int[] pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16s16sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16s16sc_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer and 16-bit signed short integer complex dot product method, return value is 16-bit signed short integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16s16sc_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16s16sc_Sfs(@Cast("const Npp16s*") ShortPointer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp16sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc_Sfs(@Cast("const Npp16s*") ShortBuffer pSrc1, @Const Npp16sc pSrc2, int nLength, Npp16sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16s16sc_Sfs(@Cast("const Npp16s*") short[] pSrc1, @Const Npp16sc pSrc2, int nLength, Npp16sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_16sc32sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc32sc_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc32sc_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_16sc32sc_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 16-bit signed short integer complex dot product method, return value is 32-bit signed integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_16sc32sc_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_16sc32sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc32sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_16sc32sc_Sfs(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsDotProd_32s32sc_Sfs.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32s32sc_Sfs(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32s32sc_Sfs(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsDotProdGetBufferSize_32s32sc_Sfs(int nLength,  int[] hpBufferSize);

/** 
 * 32-bit signed short integer and 32-bit signed short integer complex dot product method, return value is 32-bit signed integer complex.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDp Pointer to the dot product result.
 * \param nScaleFactor \ref integer_result_scaling.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsDotProdGetBufferSize_32s32sc_Sfs to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsDotProd_32s32sc_Sfs(@Cast("const Npp32s*") IntPointer pSrc1, @Const Npp32sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                        @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32s32sc_Sfs(@Cast("const Npp32s*") IntBuffer pSrc1, @Const Npp32sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                        @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsDotProd_32s32sc_Sfs(@Cast("const Npp32s*") int[] pSrc1, @Const Npp32sc pSrc2, int nLength, Npp32sc pDp, int nScaleFactor, 
                        @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_dot_product */

/** @defgroup signal_count_in_range Count In Range
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsCountInRange_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsCountInRangeGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsCountInRangeGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsCountInRangeGetBufferSize_32s(int nLength,  int[] hpBufferSize);

/** 
 * Computes the number of elements whose values fall into the specified range on a 32-bit signed integer array.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pCounts Pointer to the number of elements.
 * \param nLowerBound Lower bound of the specified range.
 * \param nUpperBound Upper bound of the specified range.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsCountInRangeGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsCountInRange_32s(@Cast("const Npp32s*") IntPointer pSrc, int nLength, IntPointer pCounts, @Cast("Npp32s") int nLowerBound, @Cast("Npp32s") int nUpperBound,
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsCountInRange_32s(@Cast("const Npp32s*") IntBuffer pSrc, int nLength, IntBuffer pCounts, @Cast("Npp32s") int nLowerBound, @Cast("Npp32s") int nUpperBound,
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsCountInRange_32s(@Cast("const Npp32s*") int[] pSrc, int nLength, int[] pCounts, @Cast("Npp32s") int nLowerBound, @Cast("Npp32s") int nUpperBound,
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_count_in_range */

/** @defgroup signal_count_zero_crossings Count Zero Crossings
 *
 * @{
 *
 */

/** 
 * Device-buffer size (in bytes) for nppsZeroCrossing_16s32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsZeroCrossingGetBufferSize_16s32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsZeroCrossingGetBufferSize_16s32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsZeroCrossingGetBufferSize_16s32f(int nLength, int[] hpBufferSize);

/** 
 * 16-bit signed short integer zero crossing method, return value is 32-bit floating point.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pValZC Pointer to the output result.
 * \param tZCType Type of the zero crossing measure: nppZCR, nppZCXor or nppZCC.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsZeroCrossingGetBufferSize_16s32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZeroCrossing_16s32f(@Cast("const Npp16s*") ShortPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pValZC, @Cast("NppsZCType") int tZCType,
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsZeroCrossing_16s32f(@Cast("const Npp16s*") ShortBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pValZC, @Cast("NppsZCType") int tZCType,
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsZeroCrossing_16s32f(@Cast("const Npp16s*") short[] pSrc, int nLength, @Cast("Npp32f*") float[] pValZC, @Cast("NppsZCType") int tZCType,
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsZeroCrossing_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsZeroCrossingGetBufferSize_32f(int nLength, IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsZeroCrossingGetBufferSize_32f(int nLength, IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsZeroCrossingGetBufferSize_32f(int nLength, int[] hpBufferSize);

/** 
 * 32-bit floating-point zero crossing method, return value is 32-bit floating point.
 * \param pSrc \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pValZC Pointer to the output result.
 * \param tZCType Type of the zero crossing measure: nppZCR, nppZCXor or nppZCC.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsZeroCrossingGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsZeroCrossing_32f(@Cast("const Npp32f*") FloatPointer pSrc, int nLength, @Cast("Npp32f*") FloatPointer pValZC, @Cast("NppsZCType") int tZCType,
                     @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsZeroCrossing_32f(@Cast("const Npp32f*") FloatBuffer pSrc, int nLength, @Cast("Npp32f*") FloatBuffer pValZC, @Cast("NppsZCType") int tZCType,
                     @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsZeroCrossing_32f(@Cast("const Npp32f*") float[] pSrc, int nLength, @Cast("Npp32f*") float[] pValZC, @Cast("NppsZCType") int tZCType,
                     @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_count_zero_crossings */

/** @defgroup signal_maximum_error MaximumError
 * Primitives for computing the maximum error between two signals.
 * Given two signals \f$pSrc1\f$ and \f$pSrc2\f$ both with length \f$N\f$, 
 * the maximum error is defined as the largest absolute difference between the corresponding
 * elements of two signals.
 *
 * If the signal is in complex format, the absolute value of the complex number is used.
 * @{
 *
 */
/** 
 * 8-bit unsigned char maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_8u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_8u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_8u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_8u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 8-bit signed char maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_8s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_8s(@Cast("const Npp8s*") BytePointer pSrc1, @Cast("const Npp8s*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_8s(@Cast("const Npp8s*") ByteBuffer pSrc1, @Cast("const Npp8s*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_8s(@Cast("const Npp8s*") byte[] pSrc1, @Cast("const Npp8s*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_16u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit signed short integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_16s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_16s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_16s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short complex integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_16sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_32u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit signed short integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_32s(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32s(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32s(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short complex integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_32sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit signed short integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_64s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_64s(@Cast("const Npp64s*") LongPointer pSrc1, @Cast("const Npp64s*") LongPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64s(@Cast("const Npp64s*") LongBuffer pSrc1, @Cast("const Npp64s*") LongBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64s(@Cast("const Npp64s*") long[] pSrc1, @Cast("const Npp64s*") long[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit unsigned short complex integer maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_64sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point complex maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point complex maximum method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumErrorGetBufferSize_64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_8u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_8u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_8u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_8u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_8s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_8s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_8s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_8s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_16u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_16sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_16sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_32u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_32sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_64s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_64sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_32fc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumError_64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumErrorGetBufferSize_64fc(int nLength,  int[] hpBufferSize);
/** @} */

/** @defgroup signal_average_error AverageError
 * Primitives for computing the Average error between two signals.
 * Given two signals \f$pSrc1\f$ and \f$pSrc2\f$ both with length \f$N\f$, 
 * the average error is defined as
 * \f[Average Error = \frac{1}{N}\sum_{n=0}^{N-1}\left|pSrc1(n) - pSrc2(n)\right|\f]
 *
 * If the signal is in complex format, the absolute value of the complex number is used.
 * @{
 *
 */
/** 
 * 8-bit unsigned char Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_8u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_8u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_8u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_8u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 8-bit signed char Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_8s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_8s(@Cast("const Npp8s*") BytePointer pSrc1, @Cast("const Npp8s*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_8s(@Cast("const Npp8s*") ByteBuffer pSrc1, @Cast("const Npp8s*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_8s(@Cast("const Npp8s*") byte[] pSrc1, @Cast("const Npp8s*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_16u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit signed short integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_16s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_16s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_16s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short complex integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_16sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_32u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit signed short integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_32s(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32s(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32s(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short complex integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_32sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit signed short integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_64s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_64s(@Cast("const Npp64s*") LongPointer pSrc1, @Cast("const Npp64s*") LongPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64s(@Cast("const Npp64s*") LongBuffer pSrc1, @Cast("const Npp64s*") LongBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64s(@Cast("const Npp64s*") long[] pSrc1, @Cast("const Npp64s*") long[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit unsigned short complex integer Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_64sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point complex Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point complex Average method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageErrorGetBufferSize_64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_8u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_8u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_8u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_8u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_8s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_8s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_8s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_8s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_16u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_16sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_16sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_32u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_32sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_64s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_64sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_32fc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageError_64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageErrorGetBufferSize_64fc(int nLength,  int[] hpBufferSize);
/** @} */

/** @defgroup signal_maximum_relative_error MaximumRelativeError
 * Primitives for computing the MaximumRelative error between two signals.
 * Given two signals \f$pSrc1\f$ and \f$pSrc2\f$ both with length \f$N\f$, 
 * the maximum relative error is defined as
 * \f[MaximumRelativeError = max{\frac{\left|pSrc1(n) - pSrc2(n)\right|}{max(\left|pSrc1(n)\right|, \left|pSrc2(n)\right|)}}\f]
 *
 * If the signal is in complex format, the absolute value of the complex number is used.
 * @{
 *
 */
/** 
 * 8-bit unsigned char MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_8u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_8u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_8u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_8u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 8-bit signed char MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_8s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_8s(@Cast("const Npp8s*") BytePointer pSrc1, @Cast("const Npp8s*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_8s(@Cast("const Npp8s*") ByteBuffer pSrc1, @Cast("const Npp8s*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_8s(@Cast("const Npp8s*") byte[] pSrc1, @Cast("const Npp8s*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_16u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit signed short integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short complex integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_16sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_32u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit signed short integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32s(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32s(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32s(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short complex integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_32sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit signed short integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_64s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64s(@Cast("const Npp64s*") LongPointer pSrc1, @Cast("const Npp64s*") LongPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64s(@Cast("const Npp64s*") LongBuffer pSrc1, @Cast("const Npp64s*") LongBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64s(@Cast("const Npp64s*") long[] pSrc1, @Cast("const Npp64s*") long[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit unsigned short complex integer MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_64sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point complex MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point complex MaximumRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsMaximumRelativeErrorGetBufferSize_64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsMaximumRelativeError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_8u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_8u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_8u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_8u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_8s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_8s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_8s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_8s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_16u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_16sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_16sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_32u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_32sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_64s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_64sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_32fc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsMaximumRelativeError_64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsMaximumRelativeErrorGetBufferSize_64fc(int nLength,  int[] hpBufferSize);
/** @} */

/** @defgroup signal_average_relative_error AverageRelativeError
 * Primitives for computing the AverageRelative error between two signals.
 * Given two signals \f$pSrc1\f$ and \f$pSrc2\f$ both with length \f$N\f$, 
 * the average relative error is defined as
 * \f[AverageRelativeError = \frac{1}{N}\sum_{n=0}^{N-1}\frac{\left|pSrc1(n) - pSrc2(n)\right|}{max(\left|pSrc1(n)\right|, \left|pSrc2(n)\right|)}\f]
 *
 * If the signal is in complex format, the absolute value of the complex number is used.
 * @{
 *
 */
/** 
 * 8-bit unsigned char AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_8u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_8u(@Cast("const Npp8u*") BytePointer pSrc1, @Cast("const Npp8u*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_8u(@Cast("const Npp8u*") ByteBuffer pSrc1, @Cast("const Npp8u*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_8u(@Cast("const Npp8u*") byte[] pSrc1, @Cast("const Npp8u*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 8-bit signed char AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_8s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_8s(@Cast("const Npp8s*") BytePointer pSrc1, @Cast("const Npp8s*") BytePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_8s(@Cast("const Npp8s*") ByteBuffer pSrc1, @Cast("const Npp8s*") ByteBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_8s(@Cast("const Npp8s*") byte[] pSrc1, @Cast("const Npp8s*") byte[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_16u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_16u(@Cast("const Npp16u*") ShortPointer pSrc1, @Cast("const Npp16u*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_16u(@Cast("const Npp16u*") ShortBuffer pSrc1, @Cast("const Npp16u*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_16u(@Cast("const Npp16u*") short[] pSrc1, @Cast("const Npp16u*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit signed short integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_16s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_16s(@Cast("const Npp16s*") ShortPointer pSrc1, @Cast("const Npp16s*") ShortPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_16s(@Cast("const Npp16s*") ShortBuffer pSrc1, @Cast("const Npp16s*") ShortBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_16s(@Cast("const Npp16s*") short[] pSrc1, @Cast("const Npp16s*") short[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 16-bit unsigned short complex integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_16sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_16sc(@Const Npp16sc pSrc1, @Const Npp16sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_32u to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_32u(@Cast("const Npp32u*") IntPointer pSrc1, @Cast("const Npp32u*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32u(@Cast("const Npp32u*") IntBuffer pSrc1, @Cast("const Npp32u*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32u(@Cast("const Npp32u*") int[] pSrc1, @Cast("const Npp32u*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit signed short integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_32s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_32s(@Cast("const Npp32s*") IntPointer pSrc1, @Cast("const Npp32s*") IntPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32s(@Cast("const Npp32s*") IntBuffer pSrc1, @Cast("const Npp32s*") IntBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32s(@Cast("const Npp32s*") int[] pSrc1, @Cast("const Npp32s*") int[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit unsigned short complex integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_32sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32sc(@Const Npp32sc pSrc1, @Const Npp32sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit signed short integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_64s to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_64s(@Cast("const Npp64s*") LongPointer pSrc1, @Cast("const Npp64s*") LongPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64s(@Cast("const Npp64s*") LongBuffer pSrc1, @Cast("const Npp64s*") LongBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64s(@Cast("const Npp64s*") long[] pSrc1, @Cast("const Npp64s*") long[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit unsigned short complex integer AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_64sc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64sc(@Const Npp64sc pSrc1, @Const Npp64sc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_32f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_32f(@Cast("const Npp32f*") FloatPointer pSrc1, @Cast("const Npp32f*") FloatPointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32f(@Cast("const Npp32f*") FloatBuffer pSrc1, @Cast("const Npp32f*") FloatBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32f(@Cast("const Npp32f*") float[] pSrc1, @Cast("const Npp32f*") float[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 32-bit floating point complex AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_32fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_32fc(@Const Npp32fc pSrc1, @Const Npp32fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_64f to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_64f(@Cast("const Npp64f*") DoublePointer pSrc1, @Cast("const Npp64f*") DoublePointer pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64f(@Cast("const Npp64f*") DoubleBuffer pSrc1, @Cast("const Npp64f*") DoubleBuffer pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64f(@Cast("const Npp64f*") double[] pSrc1, @Cast("const Npp64f*") double[] pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * 64-bit floating point complex AverageRelative method.
 * \param pSrc1 \ref source_signal_pointer.
 * \param pSrc2 \ref source_signal_pointer.
 * \param nLength \ref length_specification.
 * \param pDst Pointer to the error result.
 * \param pDeviceBuffer Pointer to the required device memory allocation, \ref general_scratch_buffer. 
 *        Use \ref nppsAverageRelativeErrorGetBufferSize_64fc to determine the minium number of bytes required.
 * \return \ref signal_data_error_codes, \ref length_error_codes.
 */
public static native @Cast("NppStatus") int nppsAverageRelativeError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoublePointer pDst, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") DoubleBuffer pDst, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsAverageRelativeError_64fc(@Const Npp64fc pSrc1, @Const Npp64fc pSrc2, int nLength, @Cast("Npp64f*") double[] pDst, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_8u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_8u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_8u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_8u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_8s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_8s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_8s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_8s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_16u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_16s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_16sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_16sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_32u.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32u(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32u(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32u(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_32s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_32sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_64s.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64s(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_64sc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64sc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64sc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64sc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_32f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_32fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_32fc(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_64f.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64f(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64f(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64f(int nLength,  int[] hpBufferSize);

/** 
 * Device-buffer size (in bytes) for nppsAverageRelativeError_64fc.
 * \param nLength \ref length_specification.
 * \param hpBufferSize Required buffer size.  Important: 
 *        hpBufferSize is a <em>host pointer.</em>
 * \return NPP_SUCCESS
 */
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64fc(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64fc(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsAverageRelativeErrorGetBufferSize_64fc(int nLength,  int[] hpBufferSize);
/** @} */


/** @} signal_statistical_functions */

// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPS_STATISTICS_FUNCTIONS_H */


// Parsed from <npps_filtering_functions.h>

 /* Copyright 2010-2014 NVIDIA Corporation.  All rights reserved. 
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
// #ifndef NV_NPPS_FILTERING_FUNCTIONS_H
// #define NV_NPPS_FILTERING_FUNCTIONS_H
 
/**
 * \file npps_filtering_functions.h
 * NPP Signal Processing Functionality.
 */
 
// #include "nppdefs.h"


// #ifdef __cplusplus
// #endif

/** @defgroup signal_filtering_functions Filtering Functions
 *  @ingroup npps
 * Functions that provide functionality of generating output signal
 * based on the input signal like signal integral, etc.
 *
 * @{
 *
 */

/** @defgroup signal_integral Integral
 * Compute the indefinite interal of a given signal.
 * The i-th element is computed to be
 * \f[
 *      s'_i = \sum_0^i s_j
 * \f]
 *
 * @{
 */
 

public static native @Cast("NppStatus") int nppsIntegralGetBufferSize_32s(int nLength,  IntPointer hpBufferSize);
public static native @Cast("NppStatus") int nppsIntegralGetBufferSize_32s(int nLength,  IntBuffer hpBufferSize);
public static native @Cast("NppStatus") int nppsIntegralGetBufferSize_32s(int nLength,  int[] hpBufferSize);


public static native @Cast("NppStatus") int nppsIntegral_32s(@Cast("const Npp32s*") IntPointer pSrc, @Cast("Npp32s*") IntPointer pDst, int nLength, @Cast("Npp8u*") BytePointer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsIntegral_32s(@Cast("const Npp32s*") IntBuffer pSrc, @Cast("Npp32s*") IntBuffer pDst, int nLength, @Cast("Npp8u*") ByteBuffer pDeviceBuffer);
public static native @Cast("NppStatus") int nppsIntegral_32s(@Cast("const Npp32s*") int[] pSrc, @Cast("Npp32s*") int[] pDst, int nLength, @Cast("Npp8u*") byte[] pDeviceBuffer);

/** @} signal_integral */

/** @} signal_filtering_functions */

// #ifdef __cplusplus /* extern "C" */
// #endif

// #endif /* NV_NPPS_FILTERING_FUNCTIONS_H */


}
