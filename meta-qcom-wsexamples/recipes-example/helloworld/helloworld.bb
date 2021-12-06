#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#
PN="helloworld"

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"
SRC_URI = "file://*	"
DEPENDS += " cmake "
inherit autotools cmake pkgconfig

S = "${WORKDIR}/"

EXTRA_OECMAKE=""

#do_compile() {
#	     ${CC} helloworld.c -o helloworld
#}
#
do_install() {
	     install -d ${D}${bindir}
	     install -m 0755   ${S}build/helloworld ${D}${bindir}
}
