# 1win WebView-Hijack PoC

Inert research proof-of-concept package accompanying a responsibly disclosed vulnerability report. See the Releases section for the packaged asset.

This app requests **zero permissions**. On launch it sends a single `Intent` to another installed app's exported activity, carrying one string extra that points at a URL. It performs no other action and displays no functionality of its own beyond that.

Provided solely as supporting evidence for the linked vulnerability report; not intended for any other use.
