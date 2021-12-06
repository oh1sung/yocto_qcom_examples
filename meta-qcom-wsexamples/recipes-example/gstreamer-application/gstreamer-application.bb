#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#
PROVIDES = "${PACKAGES}"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PN="gstreamer-application"

DESCRIPTION = "Gstreamer example application"
SECTION = "gstreamer-application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"
SRC_URI = "file://*	"
#DEPENDS += " cmake "
inherit pkgconfig

DEPENDS = "gstreamer1.0 "


S = "${WORKDIR}/"

do_compile() {
		 cd ${S}
	     oe_runmake -f Makefile all
}

do_install() {
	install -d ${D}${bindir}
	oe_runmake install 'DESTDIR=${D}${bindir}'
}


FILES_${PN} += "${bindir}/*"
FILES_${PN} += "${binddir}/audio_playback"  
FILES_${PN} += "${binddir}/audio_record"  
FILES_${PN} += "${binddir}/gst_audio_sample"  
FILES_${PN} += "${binddir}/ispcam_display"  
FILES_${PN} += "${binddir}/ispcam_encode_mp4"  
FILES_${PN} += "${binddir}/mp4_decode_playback"  
FILES_${PN} += "${binddir}/tcp_server"  
FILES_${PN} += "${binddir}/tflite_object_detection"  
FILES_${PN} += "${binddir}/transform_display"  
FILES_${PN} += "${binddir}/usbcam_display"  
FILES_${PN} += "${binddir}/usbcam_encode_mp4"  

FILES_audio_playback += "${binddir}/audio_playback"  
FILES_audio_record  += "${binddir}/audio_record"  
FILES_gst_audio_sample  += "${binddir}/gst_audio_sample"  
FILES_ispcam_display  += "${binddir}/ispcam_display"  
FILES_ispcam_encode_mp4  += "${binddir}/ispcam_encode_mp4"  
FILES_mp4_decode_playback  += "${binddir}/mp4_decode_playback"  
FILES_tcp_server  += "${binddir}/tcp_server"  
FILES_tflite_object_detection  += "${binddir}/tflite_object_detection"  
FILES_transform_display  += "${binddir}/transform_display"  
FILES_usbcam_display  += "${binddir}/usbcam_display"  
FILES_usbcam_encode_mp4 += "${binddir}/usbcam_encode_mp4"  