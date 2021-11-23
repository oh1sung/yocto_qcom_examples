# Copyright (c) 2020 Qualcomm Innovation Center, Inc.  All Rights Reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

CC = $(CCLD)
FLAGS=`pkg-config --cflags --libs gstreamer-1.0`

SOURCES = \
	usbcam_display.c \
	ispcam_display.c

TARGETS = $(foreach n,$(SOURCES),$(basename $(n)))

all: ${TARGETS}

.PHONY: all clean install

${TARGETS}: %:%.c
	$(CC) -Wall $< -o $@ $(FLAGS)

clean:
	rm -f ${TARGETS}

#install:
#	$(foreach n,$(TARGETS),$(shell cp $(n) $(DESTDIR)))


install: install_usbcam_display install_ispcam_display

install_usbcam_display: usbcam_display
	install -d $(DESTDIR)
	install -m 755 usbcam_display $(DESTDIR)

install_ispcam_display: ispcam_display
	install -d $(DESTDIR)
	install -m 755 ispcam_display $(DESTDIR)


#install : $(addrefix install_,$(TARGETS))

#$(addprefix install_,$(TOOLS)):%
#       install -d $(DESTDIR)
#       install -m 755 $< $(DESTDIR)/$<
#echo :
#       @echo "install : $(addrefix install_,$(TARGETS))"
#       @echo " $(addprefix install_,$(TOOLS)):%"
#       @echo " install -d $(DESTDIR)"
#



#define intall_template
#
#install_$(1): $(1)
#       install -d $(DESTDIR)
#       install -m 755 $(1) $(DESTDIR)
#
#uninstall_$(1):
#       rm  $(DESTDIR)/$(1)
#endef
#
$(foreach tool,$(TARGETS),$(call install_template,$(tool)))
#
#install:$(addrefix install_,$(TARGETS))
.PHONY: all clean install $(addrefix install_,$(TARGETS))
.PHONY: $(addrefix uninstall_,$(TARGETS))
