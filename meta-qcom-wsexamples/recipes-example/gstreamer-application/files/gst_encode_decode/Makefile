# Copyright (c) 2020 Qualcomm Innovation Center, Inc.  All Rights Reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

CC = $(CCLD)
FLAGS=`pkg-config --cflags --libs gstreamer-1.0`

SOURCES = \
	usbcam_encode_mp4.c \
	ispcam_encode_mp4.c \
	mp4_decode_playback.c

TARGETS = $(foreach n,$(SOURCES),$(basename $(n)))

all: ${TARGETS}

.PHONY: all clean install

${TARGETS}: %:%.c
	$(CC) -Wall $< -o $@ $(FLAGS)

clean:
	rm -f ${TARGETS}

install: install_usbcam_encode_mp4 install_ispcam_encode_mp4 install_mp4_decode_playback

install_usbcam_encode_mp4: usbcam_encode_mp4
	install -d $(DESTDIR)
	install -m 755 usbcam_encode_mp4 $(DESTDIR)

install_ispcam_encode_mp4: ispcam_encode_mp4
	install -d $(DESTDIR)
	install -m 755 ispcam_encode_mp4 $(DESTDIR)	

install_mp4_decode_playback: mp4_decode_playback
	install -d $(DESTDIR)
	install -m 755 mp4_decode_playback $(DESTDIR)	