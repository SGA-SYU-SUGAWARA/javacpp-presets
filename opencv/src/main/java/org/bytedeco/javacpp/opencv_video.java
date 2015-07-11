// Targeted by JavaCPP version 1.0

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;

public class opencv_video extends org.bytedeco.javacpp.helper.opencv_video {
    static { Loader.load(); }

// Parsed from <opencv2/video.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_VIDEO_HPP__
// #define __OPENCV_VIDEO_HPP__

/**
  @defgroup video Video Analysis
  @{
    @defgroup video_motion Motion Analysis
    @defgroup video_track Object Tracking
    @defgroup video_c C API
  @}
*/

// #include "opencv2/video/tracking.hpp"
// #include "opencv2/video/background_segm.hpp"

// #ifndef DISABLE_OPENCV_24_COMPATIBILITY
// #include "opencv2/video/tracking_c.h"
// #endif

// #endif //__OPENCV_VIDEO_HPP__


// Parsed from <opencv2/video/tracking_c.h>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_TRACKING_C_H__
// #define __OPENCV_TRACKING_C_H__

// #include "opencv2/imgproc/types_c.h"

// #ifdef __cplusplus
// #endif

/** @addtogroup video_c
  @{
*/

/****************************************************************************************\
*                                  Motion Analysis                                       *
\****************************************************************************************/

/************************************ optical flow ***************************************/

public static final int CV_LKFLOW_PYR_A_READY =       1;
public static final int CV_LKFLOW_PYR_B_READY =       2;
public static final int CV_LKFLOW_INITIAL_GUESSES =   4;
public static final int CV_LKFLOW_GET_MIN_EIGENVALS = 8;

/* It is Lucas & Kanade method, modified to use pyramids.
   Also it does several iterations to get optical flow for
   every point at every pyramid level.
   Calculates optical flow between two images for certain set of points (i.e.
   it is a "sparse" optical flow, which is opposite to the previous 3 methods) */
public static native void cvCalcOpticalFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                     CvArr prev_pyr, CvArr curr_pyr,
                                     @Const CvPoint2D32f prev_features,
                                     CvPoint2D32f curr_features,
                                     int count,
                                     @ByVal CvSize win_size,
                                     int level,
                                     @Cast("char*") BytePointer status,
                                     FloatPointer track_error,
                                     @ByVal CvTermCriteria criteria,
                                     int flags );
public static native void cvCalcOpticalFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                     CvArr prev_pyr, CvArr curr_pyr,
                                     @Cast("const CvPoint2D32f*") FloatBuffer prev_features,
                                     @Cast("CvPoint2D32f*") FloatBuffer curr_features,
                                     int count,
                                     @ByVal CvSize win_size,
                                     int level,
                                     @Cast("char*") ByteBuffer status,
                                     FloatBuffer track_error,
                                     @ByVal CvTermCriteria criteria,
                                     int flags );
public static native void cvCalcOpticalFlowPyrLK( @Const CvArr prev, @Const CvArr curr,
                                     CvArr prev_pyr, CvArr curr_pyr,
                                     @Cast("const CvPoint2D32f*") float[] prev_features,
                                     @Cast("CvPoint2D32f*") float[] curr_features,
                                     int count,
                                     @ByVal CvSize win_size,
                                     int level,
                                     @Cast("char*") byte[] status,
                                     float[] track_error,
                                     @ByVal CvTermCriteria criteria,
                                     int flags );


/* Modification of a previous sparse optical flow algorithm to calculate
   affine flow */


/* Estimate rigid transformation between 2 images or 2 point sets */
public static native int cvEstimateRigidTransform( @Const CvArr A, @Const CvArr B,
                                      CvMat M, int full_affine );

/* Estimate optical flow for each pixel using the two-frame G. Farneback algorithm */
public static native void cvCalcOpticalFlowFarneback( @Const CvArr prev, @Const CvArr next,
                                        CvArr flow, double pyr_scale, int levels,
                                        int winsize, int iterations, int poly_n,
                                        double poly_sigma, int flags );

/********************************* motion templates *************************************/

/****************************************************************************************\
*        All the motion template functions work only with single channel images.         *
*        Silhouette image must have depth IPL_DEPTH_8U or IPL_DEPTH_8S                   *
*        Motion history image must have depth IPL_DEPTH_32F,                             *
*        Gradient mask - IPL_DEPTH_8U or IPL_DEPTH_8S,                                   *
*        Motion orientation image - IPL_DEPTH_32F                                        *
*        Segmentation mask - IPL_DEPTH_32F                                               *
*        All the angles are in degrees, all the times are in milliseconds                *
\****************************************************************************************/

/* Updates motion history image given motion silhouette */


/* Calculates gradient of the motion history image and fills
   a mask indicating where the gradient is valid */


/* Calculates average motion direction within a selected motion region
   (region can be selected by setting ROIs and/or by composing a valid gradient mask
   with the region mask) */


/* Splits a motion history image into a few parts corresponding to separate independent motions
   (e.g. left hand, right hand) */


/****************************************************************************************\
*                                       Tracking                                         *
\****************************************************************************************/

/* Implements CAMSHIFT algorithm - determines object position, size and orientation
   from the object histogram back project (extension of meanshift) */
public static native int cvCamShift( @Const CvArr prob_image, @ByVal CvRect window,
                        @ByVal CvTermCriteria criteria, CvConnectedComp comp,
                        CvBox2D box/*=NULL*/ );
public static native int cvCamShift( @Const CvArr prob_image, @ByVal CvRect window,
                        @ByVal CvTermCriteria criteria, CvConnectedComp comp );

/* Implements MeanShift algorithm - determines object position
   from the object histogram back project */
public static native int cvMeanShift( @Const CvArr prob_image, @ByVal CvRect window,
                         @ByVal CvTermCriteria criteria, CvConnectedComp comp );

/*
standard Kalman filter (in G. Welch' and G. Bishop's notation):

  x(k)=A*x(k-1)+B*u(k)+w(k)  p(w)~N(0,Q)
  z(k)=H*x(k)+v(k),   p(v)~N(0,R)
*/
public static class CvKalman extends AbstractCvKalman {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvKalman() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvKalman(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvKalman(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvKalman position(int position) {
        return (CvKalman)super.position(position);
    }

    public native int MP(); public native CvKalman MP(int MP);                     /* number of measurement vector dimensions */
    public native int DP(); public native CvKalman DP(int DP);                     /* number of state vector dimensions */
    public native int CP(); public native CvKalman CP(int CP);                     /* number of control vector dimensions */

    /* backward compatibility fields */
// #if 1
    public native FloatPointer PosterState(); public native CvKalman PosterState(FloatPointer PosterState);         /* =state_pre->data.fl */
    public native FloatPointer PriorState(); public native CvKalman PriorState(FloatPointer PriorState);          /* =state_post->data.fl */
    public native FloatPointer DynamMatr(); public native CvKalman DynamMatr(FloatPointer DynamMatr);           /* =transition_matrix->data.fl */
    public native FloatPointer MeasurementMatr(); public native CvKalman MeasurementMatr(FloatPointer MeasurementMatr);     /* =measurement_matrix->data.fl */
    public native FloatPointer MNCovariance(); public native CvKalman MNCovariance(FloatPointer MNCovariance);        /* =measurement_noise_cov->data.fl */
    public native FloatPointer PNCovariance(); public native CvKalman PNCovariance(FloatPointer PNCovariance);        /* =process_noise_cov->data.fl */
    public native FloatPointer KalmGainMatr(); public native CvKalman KalmGainMatr(FloatPointer KalmGainMatr);        /* =gain->data.fl */
    public native FloatPointer PriorErrorCovariance(); public native CvKalman PriorErrorCovariance(FloatPointer PriorErrorCovariance);/* =error_cov_pre->data.fl */
    public native FloatPointer PosterErrorCovariance(); public native CvKalman PosterErrorCovariance(FloatPointer PosterErrorCovariance);/* =error_cov_post->data.fl */
    public native FloatPointer Temp1(); public native CvKalman Temp1(FloatPointer Temp1);               /* temp1->data.fl */
    public native FloatPointer Temp2(); public native CvKalman Temp2(FloatPointer Temp2);               /* temp2->data.fl */
// #endif

    public native CvMat state_pre(); public native CvKalman state_pre(CvMat state_pre);           /* predicted state (x'(k)):
                                    x(k)=A*x(k-1)+B*u(k) */
    public native CvMat state_post(); public native CvKalman state_post(CvMat state_post);          /* corrected state (x(k)):
                                    x(k)=x'(k)+K(k)*(z(k)-H*x'(k)) */
    public native CvMat transition_matrix(); public native CvKalman transition_matrix(CvMat transition_matrix);   /* state transition matrix (A) */
    public native CvMat control_matrix(); public native CvKalman control_matrix(CvMat control_matrix);      /* control matrix (B)
                                   (it is not used if there is no control)*/
    public native CvMat measurement_matrix(); public native CvKalman measurement_matrix(CvMat measurement_matrix);  /* measurement matrix (H) */
    public native CvMat process_noise_cov(); public native CvKalman process_noise_cov(CvMat process_noise_cov);   /* process noise covariance matrix (Q) */
    public native CvMat measurement_noise_cov(); public native CvKalman measurement_noise_cov(CvMat measurement_noise_cov); /* measurement noise covariance matrix (R) */
    public native CvMat error_cov_pre(); public native CvKalman error_cov_pre(CvMat error_cov_pre);       /* priori error estimate covariance matrix (P'(k)):
                                    P'(k)=A*P(k-1)*At + Q)*/
    public native CvMat gain(); public native CvKalman gain(CvMat gain);                /* Kalman gain matrix (K(k)):
                                    K(k)=P'(k)*Ht*inv(H*P'(k)*Ht+R)*/
    public native CvMat error_cov_post(); public native CvKalman error_cov_post(CvMat error_cov_post);      /* posteriori error estimate covariance matrix (P(k)):
                                    P(k)=(I-K(k)*H)*P'(k) */
    public native CvMat temp1(); public native CvKalman temp1(CvMat temp1);               /* temporary matrices */
    public native CvMat temp2(); public native CvKalman temp2(CvMat temp2);
    public native CvMat temp3(); public native CvKalman temp3(CvMat temp3);
    public native CvMat temp4(); public native CvKalman temp4(CvMat temp4);
    public native CvMat temp5(); public native CvKalman temp5(CvMat temp5);
}

/* Creates Kalman filter and sets A, B, Q, R and state to some initial values */
public static native CvKalman cvCreateKalman( int dynam_params, int measure_params,
                                 int control_params/*=0*/);
public static native CvKalman cvCreateKalman( int dynam_params, int measure_params);

/* Releases Kalman filter state */
public static native void cvReleaseKalman( @Cast("CvKalman**") PointerPointer kalman);
public static native void cvReleaseKalman( @ByPtrPtr CvKalman kalman);

/* Updates Kalman filter by time (predicts future state of the system) */
public static native @Const CvMat cvKalmanPredict( CvKalman kalman,
                                      @Const CvMat control/*=NULL*/);
public static native @Const CvMat cvKalmanPredict( CvKalman kalman);

/* Updates Kalman filter by measurement
   (corrects state of the system and internal matrices) */
public static native @Const CvMat cvKalmanCorrect( CvKalman kalman, @Const CvMat measurement );

public static native @Const CvMat cvKalmanUpdateByTime(CvKalman arg1, CvMat arg2);
public static native @Const CvMat cvKalmanUpdateByMeasurement(CvKalman arg1, CvMat arg2);

/** @} video_c */

// #ifdef __cplusplus // extern "C"
// #endif


// #endif // __OPENCV_TRACKING_C_H__


// Parsed from <opencv2/video/tracking.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_TRACKING_HPP__
// #define __OPENCV_TRACKING_HPP__

// #include "opencv2/core.hpp"
// #include "opencv2/imgproc.hpp"

/** @addtogroup video_track
 *  @{ */

/** enum cv:: */
public static final int OPTFLOW_USE_INITIAL_FLOW     = 4,
       OPTFLOW_LK_GET_MIN_EIGENVALS = 8,
       OPTFLOW_FARNEBACK_GAUSSIAN   = 256;

/** @brief Finds an object center, size, and orientation.

@param probImage Back projection of the object histogram. See calcBackProject.
@param window Initial search window.
@param criteria Stop criteria for the underlying meanShift.
returns
(in old interfaces) Number of iterations CAMSHIFT took to converge
The function implements the CAMSHIFT object tracking algorithm @cite Bradski98 . First, it finds an
object center using meanShift and then adjusts the window size and finds the optimal rotation. The
function returns the rotated rectangle structure that includes the object position, size, and
orientation. The next position of the search window can be obtained with RotatedRect::boundingRect()

See the OpenCV sample camshiftdemo.c that tracks colored objects.

@note
-   (Python) A sample explaining the camshift tracking algorithm can be found at
    opencv_source_code/samples/python2/camshift.py
 */
@Namespace("cv") public static native @ByVal RotatedRect CamShift( @ByVal Mat probImage, @ByRef Rect window,
                                   @ByVal TermCriteria criteria );

/** @brief Finds an object on a back projection image.

@param probImage Back projection of the object histogram. See calcBackProject for details.
@param window Initial search window.
@param criteria Stop criteria for the iterative search algorithm.
returns
:   Number of iterations CAMSHIFT took to converge.
The function implements the iterative object search algorithm. It takes the input back projection of
an object and the initial position. The mass center in window of the back projection image is
computed and the search window center shifts to the mass center. The procedure is repeated until the
specified number of iterations criteria.maxCount is done or until the window center shifts by less
than criteria.epsilon. The algorithm is used inside CamShift and, unlike CamShift , the search
window size or orientation do not change during the search. You can simply pass the output of
calcBackProject to this function. But better results can be obtained if you pre-filter the back
projection and remove the noise. For example, you can do this by retrieving connected components
with findContours , throwing away contours with small area ( contourArea ), and rendering the
remaining contours with drawContours.

@note
-   A mean-shift tracking sample can be found at opencv_source_code/samples/cpp/camshiftdemo.cpp
 */
@Namespace("cv") public static native int meanShift( @ByVal Mat probImage, @ByRef Rect window, @ByVal TermCriteria criteria );

/** @brief Constructs the image pyramid which can be passed to calcOpticalFlowPyrLK.

@param img 8-bit input image.
@param pyramid output pyramid.
@param winSize window size of optical flow algorithm. Must be not less than winSize argument of
calcOpticalFlowPyrLK. It is needed to calculate required padding for pyramid levels.
@param maxLevel 0-based maximal pyramid level number.
@param withDerivatives set to precompute gradients for the every pyramid level. If pyramid is
constructed without the gradients then calcOpticalFlowPyrLK will calculate them internally.
@param pyrBorder the border mode for pyramid layers.
@param derivBorder the border mode for gradients.
@param tryReuseInputImage put ROI of input image into the pyramid if possible. You can pass false
to force data copying.
@return number of levels in constructed pyramid. Can be less than maxLevel.
 */
@Namespace("cv") public static native int buildOpticalFlowPyramid( @ByVal Mat img, @ByVal MatVector pyramid,
                                          @ByVal Size winSize, int maxLevel, @Cast("bool") boolean withDerivatives/*=true*/,
                                          int pyrBorder/*=cv::BORDER_REFLECT_101*/,
                                          int derivBorder/*=cv::BORDER_CONSTANT*/,
                                          @Cast("bool") boolean tryReuseInputImage/*=true*/ );
@Namespace("cv") public static native int buildOpticalFlowPyramid( @ByVal Mat img, @ByVal MatVector pyramid,
                                          @ByVal Size winSize, int maxLevel );

/** @brief Calculates an optical flow for a sparse feature set using the iterative Lucas-Kanade method with
pyramids.

@param prevImg first 8-bit input image or pyramid constructed by buildOpticalFlowPyramid.
@param nextImg second input image or pyramid of the same size and the same type as prevImg.
@param prevPts vector of 2D points for which the flow needs to be found; point coordinates must be
single-precision floating-point numbers.
@param nextPts output vector of 2D points (with single-precision floating-point coordinates)
containing the calculated new positions of input features in the second image; when
OPTFLOW_USE_INITIAL_FLOW flag is passed, the vector must have the same size as in the input.
@param status output status vector (of unsigned chars); each element of the vector is set to 1 if
the flow for the corresponding features has been found, otherwise, it is set to 0.
@param err output vector of errors; each element of the vector is set to an error for the
corresponding feature, type of the error measure can be set in flags parameter; if the flow wasn't
found then the error is not defined (use the status parameter to find such cases).
@param winSize size of the search window at each pyramid level.
@param maxLevel 0-based maximal pyramid level number; if set to 0, pyramids are not used (single
level), if set to 1, two levels are used, and so on; if pyramids are passed to input then
algorithm will use as many levels as pyramids have but no more than maxLevel.
@param criteria parameter, specifying the termination criteria of the iterative search algorithm
(after the specified maximum number of iterations criteria.maxCount or when the search window
moves by less than criteria.epsilon.
@param flags operation flags:
 -   **OPTFLOW_USE_INITIAL_FLOW** uses initial estimations, stored in nextPts; if the flag is
     not set, then prevPts is copied to nextPts and is considered the initial estimate.
 -   **OPTFLOW_LK_GET_MIN_EIGENVALS** use minimum eigen values as an error measure (see
     minEigThreshold description); if the flag is not set, then L1 distance between patches
     around the original and a moved point, divided by number of pixels in a window, is used as a
     error measure.
@param minEigThreshold the algorithm calculates the minimum eigen value of a 2x2 normal matrix of
optical flow equations (this matrix is called a spatial gradient matrix in @cite Bouguet00), divided
by number of pixels in a window; if this value is less than minEigThreshold, then a corresponding
feature is filtered out and its flow is not processed, so it allows to remove bad points and get a
performance boost.

The function implements a sparse iterative version of the Lucas-Kanade optical flow in pyramids. See
@cite Bouguet00 . The function is parallelized with the TBB library.

@note

-   An example using the Lucas-Kanade optical flow algorithm can be found at
    opencv_source_code/samples/cpp/lkdemo.cpp
-   (Python) An example using the Lucas-Kanade optical flow algorithm can be found at
    opencv_source_code/samples/python2/lk_track.py
-   (Python) An example using the Lucas-Kanade tracker for homography matching can be found at
    opencv_source_code/samples/python2/lk_homography.py
 */
@Namespace("cv") public static native void calcOpticalFlowPyrLK( @ByVal Mat prevImg, @ByVal Mat nextImg,
                                        @ByVal Mat prevPts, @ByVal Mat nextPts,
                                        @ByVal Mat status, @ByVal Mat err,
                                        @ByVal(nullValue = "cv::Size(21,21)") Size winSize/*=cv::Size(21,21)*/, int maxLevel/*=3*/,
                                        @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::COUNT+cv::TermCriteria::EPS, 30, 0.01)") TermCriteria criteria/*=cv::TermCriteria(cv::TermCriteria::COUNT+cv::TermCriteria::EPS, 30, 0.01)*/,
                                        int flags/*=0*/, double minEigThreshold/*=1e-4*/ );
@Namespace("cv") public static native void calcOpticalFlowPyrLK( @ByVal Mat prevImg, @ByVal Mat nextImg,
                                        @ByVal Mat prevPts, @ByVal Mat nextPts,
                                        @ByVal Mat status, @ByVal Mat err );

/** @brief Computes a dense optical flow using the Gunnar Farneback's algorithm.

@param prev first 8-bit single-channel input image.
@param next second input image of the same size and the same type as prev.
@param flow computed flow image that has the same size as prev and type CV_32FC2.
@param pyr_scale parameter, specifying the image scale (\<1) to build pyramids for each image;
pyr_scale=0.5 means a classical pyramid, where each next layer is twice smaller than the previous
one.
@param levels number of pyramid layers including the initial image; levels=1 means that no extra
layers are created and only the original images are used.
@param winsize averaging window size; larger values increase the algorithm robustness to image
noise and give more chances for fast motion detection, but yield more blurred motion field.
@param iterations number of iterations the algorithm does at each pyramid level.
@param poly_n size of the pixel neighborhood used to find polynomial expansion in each pixel;
larger values mean that the image will be approximated with smoother surfaces, yielding more
robust algorithm and more blurred motion field, typically poly_n =5 or 7.
@param poly_sigma standard deviation of the Gaussian that is used to smooth derivatives used as a
basis for the polynomial expansion; for poly_n=5, you can set poly_sigma=1.1, for poly_n=7, a
good value would be poly_sigma=1.5.
@param flags operation flags that can be a combination of the following:
 -   **OPTFLOW_USE_INITIAL_FLOW** uses the input flow as an initial flow approximation.
 -   **OPTFLOW_FARNEBACK_GAUSSIAN** uses the Gaussian \f$\texttt{winsize}\times\texttt{winsize}\f$
     filter instead of a box filter of the same size for optical flow estimation; usually, this
     option gives z more accurate flow than with a box filter, at the cost of lower speed;
     normally, winsize for a Gaussian window should be set to a larger value to achieve the same
     level of robustness.

The function finds an optical flow for each prev pixel using the @cite Farneback2003 algorithm so that

\f[\texttt{prev} (y,x)  \sim \texttt{next} ( y + \texttt{flow} (y,x)[1],  x + \texttt{flow} (y,x)[0])\f]

@note

-   An example using the optical flow algorithm described by Gunnar Farneback can be found at
    opencv_source_code/samples/cpp/fback.cpp
-   (Python) An example using the optical flow algorithm described by Gunnar Farneback can be
    found at opencv_source_code/samples/python2/opt_flow.py
 */
@Namespace("cv") public static native void calcOpticalFlowFarneback( @ByVal Mat prev, @ByVal Mat next, @ByVal Mat flow,
                                            double pyr_scale, int levels, int winsize,
                                            int iterations, int poly_n, double poly_sigma,
                                            int flags );

/** @brief Computes an optimal affine transformation between two 2D point sets.

@param src First input 2D point set stored in std::vector or Mat, or an image stored in Mat.
@param dst Second input 2D point set of the same size and the same type as A, or another image.
@param fullAffine If true, the function finds an optimal affine transformation with no additional
restrictions (6 degrees of freedom). Otherwise, the class of transformations to choose from is
limited to combinations of translation, rotation, and uniform scaling (5 degrees of freedom).

The function finds an optimal affine transform *[A|b]* (a 2 x 3 floating-point matrix) that
approximates best the affine transformation between:

*   Two point sets
*   Two raster images. In this case, the function first finds some features in the src image and
    finds the corresponding features in dst image. After that, the problem is reduced to the first
    case.
In case of point sets, the problem is formulated as follows: you need to find a 2x2 matrix *A* and
2x1 vector *b* so that:

\f[[A^*|b^*] = arg  \min _{[A|b]}  \sum _i  \| \texttt{dst}[i] - A { \texttt{src}[i]}^T - b  \| ^2\f]
where src[i] and dst[i] are the i-th points in src and dst, respectively
\f$[A|b]\f$ can be either arbitrary (when fullAffine=true ) or have a form of
\f[\begin{bmatrix} a_{11} & a_{12} & b_1  \\ -a_{12} & a_{11} & b_2  \end{bmatrix}\f]
when fullAffine=false.

@sa
getAffineTransform, getPerspectiveTransform, findHomography
 */
@Namespace("cv") public static native @ByVal Mat estimateRigidTransform( @ByVal Mat src, @ByVal Mat dst, @Cast("bool") boolean fullAffine );


/** enum cv:: */
public static final int
    MOTION_TRANSLATION = 0,
    MOTION_EUCLIDEAN   = 1,
    MOTION_AFFINE      = 2,
    MOTION_HOMOGRAPHY  = 3;

/** @brief Finds the geometric transform (warp) between two images in terms of the ECC criterion @cite EP08 .

@param templateImage single-channel template image; CV_8U or CV_32F array.
@param inputImage single-channel input image which should be warped with the final warpMatrix in
order to provide an image similar to templateImage, same type as temlateImage.
@param warpMatrix floating-point \f$2\times 3\f$ or \f$3\times 3\f$ mapping matrix (warp).
@param motionType parameter, specifying the type of motion:
 -   **MOTION_TRANSLATION** sets a translational motion model; warpMatrix is \f$2\times 3\f$ with
     the first \f$2\times 2\f$ part being the unity matrix and the rest two parameters being
     estimated.
 -   **MOTION_EUCLIDEAN** sets a Euclidean (rigid) transformation as motion model; three
     parameters are estimated; warpMatrix is \f$2\times 3\f$.
 -   **MOTION_AFFINE** sets an affine motion model (DEFAULT); six parameters are estimated;
     warpMatrix is \f$2\times 3\f$.
 -   **MOTION_HOMOGRAPHY** sets a homography as a motion model; eight parameters are
     estimated;\`warpMatrix\` is \f$3\times 3\f$.
@param criteria parameter, specifying the termination criteria of the ECC algorithm;
criteria.epsilon defines the threshold of the increment in the correlation coefficient between two
iterations (a negative criteria.epsilon makes criteria.maxcount the only termination criterion).
Default values are shown in the declaration above.
@param inputMask An optional mask to indicate valid values of inputImage.

The function estimates the optimum transformation (warpMatrix) with respect to ECC criterion
(@cite EP08), that is

\f[\texttt{warpMatrix} = \texttt{warpMatrix} = \arg\max_{W} \texttt{ECC}(\texttt{templateImage}(x,y),\texttt{inputImage}(x',y'))\f]

where

\f[\begin{bmatrix} x' \\ y' \end{bmatrix} = W \cdot \begin{bmatrix} x \\ y \\ 1 \end{bmatrix}\f]

(the equation holds with homogeneous coordinates for homography). It returns the final enhanced
correlation coefficient, that is the correlation coefficient between the template image and the
final warped input image. When a \f$3\times 3\f$ matrix is given with motionType =0, 1 or 2, the third
row is ignored.

Unlike findHomography and estimateRigidTransform, the function findTransformECC implements an
area-based alignment that builds on intensity similarities. In essence, the function updates the
initial transformation that roughly aligns the images. If this information is missing, the identity
warp (unity matrix) should be given as input. Note that if images undergo strong
displacements/rotations, an initial transformation that roughly aligns the images is necessary
(e.g., a simple euclidean/similarity transform that allows for the images showing the same image
content approximately). Use inverse warping in the second image to take an image close to the first
one, i.e. use the flag WARP_INVERSE_MAP with warpAffine or warpPerspective. See also the OpenCV
sample image_alignment.cpp that demonstrates the use of the function. Note that the function throws
an exception if algorithm does not converges.

@sa
estimateRigidTransform, findHomography
 */
@Namespace("cv") public static native double findTransformECC( @ByVal Mat templateImage, @ByVal Mat inputImage,
                                      @ByVal Mat warpMatrix, int motionType/*=cv::MOTION_AFFINE*/,
                                      @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::COUNT+cv::TermCriteria::EPS, 50, 0.001)") TermCriteria criteria/*=cv::TermCriteria(cv::TermCriteria::COUNT+cv::TermCriteria::EPS, 50, 0.001)*/,
                                      @ByVal(nullValue = "cv::noArray()") Mat inputMask/*=cv::noArray()*/);
@Namespace("cv") public static native double findTransformECC( @ByVal Mat templateImage, @ByVal Mat inputImage,
                                      @ByVal Mat warpMatrix);

/** @brief Kalman filter class.

The class implements a standard Kalman filter <http://en.wikipedia.org/wiki/Kalman_filter>,
@cite Welch95 . However, you can modify transitionMatrix, controlMatrix, and measurementMatrix to get
an extended Kalman filter functionality. See the OpenCV sample kalman.cpp.

@note

-   An example using the standard Kalman filter can be found at
    opencv_source_code/samples/cpp/kalman.cpp
 */
@Namespace("cv") @NoOffset public static class KalmanFilter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KalmanFilter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public KalmanFilter(int size) { allocateArray(size); }
    private native void allocateArray(int size);
    @Override public KalmanFilter position(int position) {
        return (KalmanFilter)super.position(position);
    }

    /** @brief The constructors.

    @note In C API when CvKalman\* kalmanFilter structure is not needed anymore, it should be released
    with cvReleaseKalman(&kalmanFilter)
     */
    public KalmanFilter() { allocate(); }
    private native void allocate();
    /** @overload
    @param dynamParams Dimensionality of the state.
    @param measureParams Dimensionality of the measurement.
    @param controlParams Dimensionality of the control vector.
    @param type Type of the created matrices that should be CV_32F or CV_64F.
    */
    public KalmanFilter( int dynamParams, int measureParams, int controlParams/*=0*/, int type/*=CV_32F*/ ) { allocate(dynamParams, measureParams, controlParams, type); }
    private native void allocate( int dynamParams, int measureParams, int controlParams/*=0*/, int type/*=CV_32F*/ );
    public KalmanFilter( int dynamParams, int measureParams ) { allocate(dynamParams, measureParams); }
    private native void allocate( int dynamParams, int measureParams );

    /** @brief Re-initializes Kalman filter. The previous content is destroyed.

    @param dynamParams Dimensionality of the state.
    @param measureParams Dimensionality of the measurement.
    @param controlParams Dimensionality of the control vector.
    @param type Type of the created matrices that should be CV_32F or CV_64F.
     */
    public native void init( int dynamParams, int measureParams, int controlParams/*=0*/, int type/*=CV_32F*/ );
    public native void init( int dynamParams, int measureParams );

    /** @brief Computes a predicted state.

    @param control The optional input control
     */
    public native @Const @ByRef Mat predict( @Const @ByRef(nullValue = "cv::Mat()") Mat control/*=cv::Mat()*/ );
    public native @Const @ByRef Mat predict( );

    /** @brief Updates the predicted state from the measurement.

    @param measurement The measured system parameters
     */
    public native @Const @ByRef Mat correct( @Const @ByRef Mat measurement );

    /** predicted state (x'(k)): x(k)=A*x(k-1)+B*u(k) */
    public native @ByRef Mat statePre(); public native KalmanFilter statePre(Mat statePre);
    /** corrected state (x(k)): x(k)=x'(k)+K(k)*(z(k)-H*x'(k)) */
    public native @ByRef Mat statePost(); public native KalmanFilter statePost(Mat statePost);
    /** state transition matrix (A) */
    public native @ByRef Mat transitionMatrix(); public native KalmanFilter transitionMatrix(Mat transitionMatrix);
    /** control matrix (B) (not used if there is no control) */
    public native @ByRef Mat controlMatrix(); public native KalmanFilter controlMatrix(Mat controlMatrix);
    /** measurement matrix (H) */
    public native @ByRef Mat measurementMatrix(); public native KalmanFilter measurementMatrix(Mat measurementMatrix);
    /** process noise covariance matrix (Q) */
    public native @ByRef Mat processNoiseCov(); public native KalmanFilter processNoiseCov(Mat processNoiseCov);
    /** measurement noise covariance matrix (R) */
    public native @ByRef Mat measurementNoiseCov(); public native KalmanFilter measurementNoiseCov(Mat measurementNoiseCov);
    /** priori error estimate covariance matrix (P'(k)): P'(k)=A*P(k-1)*At + Q)*/
    public native @ByRef Mat errorCovPre(); public native KalmanFilter errorCovPre(Mat errorCovPre);
    /** Kalman gain matrix (K(k)): K(k)=P'(k)*Ht*inv(H*P'(k)*Ht+R) */
    public native @ByRef Mat gain(); public native KalmanFilter gain(Mat gain);
    /** posteriori error estimate covariance matrix (P(k)): P(k)=(I-K(k)*H)*P'(k) */
    public native @ByRef Mat errorCovPost(); public native KalmanFilter errorCovPost(Mat errorCovPost);

    // temporary matrices
    public native @ByRef Mat temp1(); public native KalmanFilter temp1(Mat temp1);
    public native @ByRef Mat temp2(); public native KalmanFilter temp2(Mat temp2);
    public native @ByRef Mat temp3(); public native KalmanFilter temp3(Mat temp3);
    public native @ByRef Mat temp4(); public native KalmanFilter temp4(Mat temp4);
    public native @ByRef Mat temp5(); public native KalmanFilter temp5(Mat temp5);
}


@Namespace("cv") public static class DenseOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Empty constructor. */
    public DenseOpticalFlow() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseOpticalFlow(Pointer p) { super(p); }

    /** @brief Calculates an optical flow.

    @param I0 first 8-bit single-channel input image.
    @param I1 second input image of the same size and the same type as prev.
    @param flow computed flow image that has the same size as prev and type CV_32FC2.
     */
    public native void calc( @ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow );
    /** @brief Releases all inner buffers.
    */
    public native void collectGarbage();
}

/** @brief "Dual TV L1" Optical Flow Algorithm.

The class implements the "Dual TV L1" optical flow algorithm described in @cite Zach2007 and
@cite Javier2012 .
Here are important members of the class that control the algorithm, which you can set after
constructing the class instance:

-   member double tau
    Time step of the numerical scheme.

-   member double lambda
    Weight parameter for the data term, attachment parameter. This is the most relevant
    parameter, which determines the smoothness of the output. The smaller this parameter is,
    the smoother the solutions we obtain. It depends on the range of motions of the images, so
    its value should be adapted to each image sequence.

-   member double theta
    Weight parameter for (u - v)\^2, tightness parameter. It serves as a link between the
    attachment and the regularization terms. In theory, it should have a small value in order
    to maintain both parts in correspondence. The method is stable for a large range of values
    of this parameter.

-   member int nscales
    Number of scales used to create the pyramid of images.

-   member int warps
    Number of warpings per scale. Represents the number of times that I1(x+u0) and grad(
    I1(x+u0) ) are computed per scale. This is a parameter that assures the stability of the
    method. It also affects the running time, so it is a compromise between speed and
    accuracy.

-   member double epsilon
    Stopping criterion threshold used in the numerical scheme, which is a trade-off between
    precision and running time. A small value will yield more accurate solutions at the
    expense of a slower convergence.

-   member int iterations
    Stopping criterion iterations number used in the numerical scheme.

C. Zach, T. Pock and H. Bischof, "A Duality Based Approach for Realtime TV-L1 Optical Flow".
Javier Sanchez, Enric Meinhardt-Llopis and Gabriele Facciolo. "TV-L1 Optical Flow Estimation".
*/
@Namespace("cv") public static class DualTVL1OpticalFlow extends DenseOpticalFlow {
    static { Loader.load(); }
    /** Empty constructor. */
    public DualTVL1OpticalFlow() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DualTVL1OpticalFlow(Pointer p) { super(p); }

    /** @brief Time step of the numerical scheme
    /** @see setTau */
    public native double getTau();
    /** @copybrief getTau @see getTau */
    public native void setTau(double val);
    /** @brief Weight parameter for the data term, attachment parameter
    /** @see setLambda */
    public native double getLambda();
    /** @copybrief getLambda @see getLambda */
    public native void setLambda(double val);
    /** @brief Weight parameter for (u - v)^2, tightness parameter
    /** @see setTheta */
    public native double getTheta();
    /** @copybrief getTheta @see getTheta */
    public native void setTheta(double val);
    /** @brief coefficient for additional illumination variation term
    /** @see setGamma */
    public native double getGamma();
    /** @copybrief getGamma @see getGamma */
    public native void setGamma(double val);
    /** @brief Number of scales used to create the pyramid of images
    /** @see setScalesNumber */
    public native int getScalesNumber();
    /** @copybrief getScalesNumber @see getScalesNumber */
    public native void setScalesNumber(int val);
    /** @brief Number of warpings per scale
    /** @see setWarpingsNumber */
    public native int getWarpingsNumber();
    /** @copybrief getWarpingsNumber @see getWarpingsNumber */
    public native void setWarpingsNumber(int val);
    /** @brief Stopping criterion threshold used in the numerical scheme, which is a trade-off between precision and running time
    /** @see setEpsilon */
    public native double getEpsilon();
    /** @copybrief getEpsilon @see getEpsilon */
    public native void setEpsilon(double val);
    /** @brief Inner iterations (between outlier filtering) used in the numerical scheme
    /** @see setInnerIterations */
    public native int getInnerIterations();
    /** @copybrief getInnerIterations @see getInnerIterations */
    public native void setInnerIterations(int val);
    /** @brief Outer iterations (number of inner loops) used in the numerical scheme
    /** @see setOuterIterations */
    public native int getOuterIterations();
    /** @copybrief getOuterIterations @see getOuterIterations */
    public native void setOuterIterations(int val);
    /** @brief Use initial flow
    /** @see setUseInitialFlow */
    public native @Cast("bool") boolean getUseInitialFlow();
    /** @copybrief getUseInitialFlow @see getUseInitialFlow */
    public native void setUseInitialFlow(@Cast("bool") boolean val);
    /** @brief Step between scales (<1)
    /** @see setScaleStep */
    public native double getScaleStep();
    /** @copybrief getScaleStep @see getScaleStep */
    public native void setScaleStep(double val);
    /** @brief Median filter kernel size (1 = no filter) (3 or 5)
    /** @see setMedianFiltering */
    public native int getMedianFiltering();
    /** @copybrief getMedianFiltering @see getMedianFiltering */
    public native void setMedianFiltering(int val);
}

/** @brief Creates instance of cv::DenseOpticalFlow
*/
@Namespace("cv") public static native @Ptr DualTVL1OpticalFlow createOptFlow_DualTVL1();

/** @} video_track */

 // cv

// #endif


// Parsed from <opencv2/video/background_segm.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_BACKGROUND_SEGM_HPP__
// #define __OPENCV_BACKGROUND_SEGM_HPP__

// #include "opencv2/core.hpp"

/** @addtogroup video_motion
 *  @{

/** @brief Base class for background/foreground segmentation. :

The class is only used to define the common interface for the whole family of background/foreground
segmentation algorithms.
 */
@Namespace("cv") public static class BackgroundSubtractor extends Algorithm {
    static { Loader.load(); }
    /** Empty constructor. */
    public BackgroundSubtractor() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractor(Pointer p) { super(p); }

    /** @brief Computes a foreground mask.

    @param image Next video frame.
    @param fgmask The output foreground mask as an 8-bit binary image.
    @param learningRate The value between 0 and 1 that indicates how fast the background model is
    learnt. Negative parameter value makes the algorithm to use some automatically chosen learning
    rate. 0 means that the background model is not updated at all, 1 means that the background model
    is completely reinitialized from the last frame.
     */
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);

    /** @brief Computes a background image.

    @param backgroundImage The output background image.

    @note Sometimes the background image can be very blurry, as it contain the average background
    statistics.
     */
    public native void getBackgroundImage(@ByVal Mat backgroundImage);
}


/** @brief Gaussian Mixture-based Background/Foreground Segmentation Algorithm.

The class implements the Gaussian mixture model background subtraction described in @cite Zivkovic2004
and @cite Zivkovic2006 .
 */
@Namespace("cv") public static class BackgroundSubtractorMOG2 extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Empty constructor. */
    public BackgroundSubtractorMOG2() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorMOG2(Pointer p) { super(p); }

    /** @brief Returns the number of last frames that affect the background model
    */
    public native int getHistory();
    /** @brief Sets the number of last frames that affect the background model
    */
    public native void setHistory(int history);

    /** @brief Returns the number of gaussian components in the background model
    */
    public native int getNMixtures();
    /** @brief Sets the number of gaussian components in the background model.

    The model needs to be reinitalized to reserve memory.
    */
    public native void setNMixtures(int nmixtures);//needs reinitialization!

    /** @brief Returns the "background ratio" parameter of the algorithm

    If a foreground pixel keeps semi-constant value for about backgroundRatio\*history frames, it's
    considered background and added to the model as a center of a new component. It corresponds to TB
    parameter in the paper.
     */
    public native double getBackgroundRatio();
    /** @brief Sets the "background ratio" parameter of the algorithm
    */
    public native void setBackgroundRatio(double ratio);

    /** @brief Returns the variance threshold for the pixel-model match

    The main threshold on the squared Mahalanobis distance to decide if the sample is well described by
    the background model or not. Related to Cthr from the paper.
     */
    public native double getVarThreshold();
    /** @brief Sets the variance threshold for the pixel-model match
    */
    public native void setVarThreshold(double varThreshold);

    /** @brief Returns the variance threshold for the pixel-model match used for new mixture component generation

    Threshold for the squared Mahalanobis distance that helps decide when a sample is close to the
    existing components (corresponds to Tg in the paper). If a pixel is not close to any component, it
    is considered foreground or added as a new component. 3 sigma =\> Tg=3\*3=9 is default. A smaller Tg
    value generates more components. A higher Tg value may result in a small number of components but
    they can grow too large.
     */
    public native double getVarThresholdGen();
    /** @brief Sets the variance threshold for the pixel-model match used for new mixture component generation
    */
    public native void setVarThresholdGen(double varThresholdGen);

    /** @brief Returns the initial variance of each gaussian component
    */
    public native double getVarInit();
    /** @brief Sets the initial variance of each gaussian component
    */
    public native void setVarInit(double varInit);

    public native double getVarMin();
    public native void setVarMin(double varMin);

    public native double getVarMax();
    public native void setVarMax(double varMax);

    /** @brief Returns the complexity reduction threshold

    This parameter defines the number of samples needed to accept to prove the component exists. CT=0.05
    is a default value for all the samples. By setting CT=0 you get an algorithm very similar to the
    standard Stauffer&Grimson algorithm.
     */
    public native double getComplexityReductionThreshold();
    /** @brief Sets the complexity reduction threshold
    */
    public native void setComplexityReductionThreshold(double ct);

    /** @brief Returns the shadow detection flag

    If true, the algorithm detects shadows and marks them. See createBackgroundSubtractorMOG2 for
    details.
     */
    public native @Cast("bool") boolean getDetectShadows();
    /** @brief Enables or disables shadow detection
    */
    public native void setDetectShadows(@Cast("bool") boolean detectShadows);

    /** @brief Returns the shadow value

    Shadow value is the value used to mark shadows in the foreground mask. Default value is 127. Value 0
    in the mask always means background, 255 means foreground.
     */
    public native int getShadowValue();
    /** @brief Sets the shadow value
    */
    public native void setShadowValue(int value);

    /** @brief Returns the shadow threshold

    A shadow is detected if pixel is a darker version of the background. The shadow threshold (Tau in
    the paper) is a threshold defining how much darker the shadow can be. Tau= 0.5 means that if a pixel
    is more than twice darker then it is not shadow. See Prati, Mikic, Trivedi and Cucchiarra,
    *Detecting Moving Shadows...*, IEEE PAMI,2003.
     */
    public native double getShadowThreshold();
    /** @brief Sets the shadow threshold
    */
    public native void setShadowThreshold(double threshold);
}

/** @brief Creates MOG2 Background Subtractor

@param history Length of the history.
@param varThreshold Threshold on the squared Mahalanobis distance between the pixel and the model
to decide whether a pixel is well described by the background model. This parameter does not
affect the background update.
@param detectShadows If true, the algorithm will detect shadows and mark them. It decreases the
speed a bit, so if you do not need this feature, set the parameter to false.
 */
@Namespace("cv") public static native @Ptr BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history/*=500*/, double varThreshold/*=16*/,
                                   @Cast("bool") boolean detectShadows/*=true*/);
@Namespace("cv") public static native @Ptr BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2();

/** @brief K-nearest neigbours - based Background/Foreground Segmentation Algorithm.

The class implements the K-nearest neigbours background subtraction described in @cite Zivkovic2006 .
Very efficient if number of foreground pixels is low.
 */
@Namespace("cv") public static class BackgroundSubtractorKNN extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Empty constructor. */
    public BackgroundSubtractorKNN() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorKNN(Pointer p) { super(p); }

    /** @brief Returns the number of last frames that affect the background model
    */
    public native int getHistory();
    /** @brief Sets the number of last frames that affect the background model
    */
    public native void setHistory(int history);

    /** @brief Returns the number of data samples in the background model
    */
    public native int getNSamples();
    /** @brief Sets the number of data samples in the background model.

    The model needs to be reinitalized to reserve memory.
    */
    public native void setNSamples(int _nN);//needs reinitialization!

    /** @brief Returns the threshold on the squared distance between the pixel and the sample

    The threshold on the squared distance between the pixel and the sample to decide whether a pixel is
    close to a data sample.
     */
    public native double getDist2Threshold();
    /** @brief Sets the threshold on the squared distance
    */
    public native void setDist2Threshold(double _dist2Threshold);

    /** @brief Returns the number of neighbours, the k in the kNN.

    K is the number of samples that need to be within dist2Threshold in order to decide that that
    pixel is matching the kNN background model.
     */
    public native int getkNNSamples();
    /** @brief Sets the k in the kNN. How many nearest neigbours need to match.
    */
    public native void setkNNSamples(int _nkNN);

    /** @brief Returns the shadow detection flag

    If true, the algorithm detects shadows and marks them. See createBackgroundSubtractorKNN for
    details.
     */
    public native @Cast("bool") boolean getDetectShadows();
    /** @brief Enables or disables shadow detection
    */
    public native void setDetectShadows(@Cast("bool") boolean detectShadows);

    /** @brief Returns the shadow value

    Shadow value is the value used to mark shadows in the foreground mask. Default value is 127. Value 0
    in the mask always means background, 255 means foreground.
     */
    public native int getShadowValue();
    /** @brief Sets the shadow value
    */
    public native void setShadowValue(int value);

    /** @brief Returns the shadow threshold

    A shadow is detected if pixel is a darker version of the background. The shadow threshold (Tau in
    the paper) is a threshold defining how much darker the shadow can be. Tau= 0.5 means that if a pixel
    is more than twice darker then it is not shadow. See Prati, Mikic, Trivedi and Cucchiarra,
    *Detecting Moving Shadows...*, IEEE PAMI,2003.
     */
    public native double getShadowThreshold();
    /** @brief Sets the shadow threshold
     */
    public native void setShadowThreshold(double threshold);
}

/** @brief Creates KNN Background Subtractor

@param history Length of the history.
@param dist2Threshold Threshold on the squared distance between the pixel and the sample to decide
whether a pixel is close to that sample. This parameter does not affect the background update.
@param detectShadows If true, the algorithm will detect shadows and mark them. It decreases the
speed a bit, so if you do not need this feature, set the parameter to false.
 */
@Namespace("cv") public static native @Ptr BackgroundSubtractorKNN createBackgroundSubtractorKNN(int history/*=500*/, double dist2Threshold/*=400.0*/,
                                   @Cast("bool") boolean detectShadows/*=true*/);
@Namespace("cv") public static native @Ptr BackgroundSubtractorKNN createBackgroundSubtractorKNN();

/** @} video_motion */

 // cv

// #endif


}
