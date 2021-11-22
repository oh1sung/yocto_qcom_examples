#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#
PN="gstreamer-application"

DESCRIPTION = "Gstreamer example application"
SECTION = "gstreamer-application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"
SRC_URI = "file://*	"
#DEPENDS += " cmake "
inherit autotools pkgconfig

DEPENDS = "gstreamer1.0 "


S = "${WORKDIR}/"

EXTRA_OECMAKE=""

do_compile() {
		 cd ${S}
	     make -f Makefile all
}

do_install() {

}
