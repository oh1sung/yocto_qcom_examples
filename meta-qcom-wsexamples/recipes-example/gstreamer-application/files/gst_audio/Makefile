# Copyright (c) 2020 Qualcomm Innovation Center, Inc.  All Rights Reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

CC = $(CCLD)
FLAGS=`pkg-config --cflags --libs gstreamer-1.0`

SOURCES = \
	audio_playback.c \
	audio_record.c

TARGETS = $(foreach n,$(SOURCES),$(basename $(n)))

all: ${TARGETS}

.PHONY: all clean install

${TARGETS}: %:%.c
	$(CC) -Wall $< -o $@ $(FLAGS)

clean:
	rm -f ${TARGETS}

#install: all
#	$(foreach n,$(TARGETS),$(shell cp $(n) $(DESTDIR)))


install: install_audio_playback install_audio_record

install_audio_playback: audio_playback
	install -d $(DESTDIR)
	install -m 755 audio_playback $(DESTDIR)

install_audio_record: audio_record
	install -d $(DESTDIR)
	install -m 755 audio_record $(DESTDIR)


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
