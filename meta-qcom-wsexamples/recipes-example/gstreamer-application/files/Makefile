# Copyright (c) 2020 Qualcomm Innovation Center, Inc.  All Rights Reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

SUBDIRS = \
	gst_audio \
	gst_camera \
	gst_encode_decode \
	gst_streaming \
	gst_transform \
	gst_alsa/src \
	gst_tflite/src 

#qt5	gst_gui_app \

.PHONY: all clean install

all: 
	@list='$(SUBDIRS)'; for subdir in $$list; do \
		$(MAKE) -C $$subdir;\
	done

clean:
	@list='$(SUBDIRS)'; for subdir in $$list; do \
		$(MAKE) -C $$subdir clean;\
	done

install: 
	@list='$(SUBDIRS)'; for subdir in $$list; do \
		$(MAKE) -C $$subdir install 'DESTDIR=$(DESTDIR)';\
	done