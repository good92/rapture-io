/**************************************************************************************************
Rapture I/O Library
Version 0.7.1

The primary distribution site is

  http://www.propensive.com/

Copyright 2010-2012 Propensive Ltd.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is
distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied. See the License for the specific language governing permissions and limitations under the
License.
***************************************************************************************************/

package rapture

trait Services { this: Io =>

  type TcpService = Services.Tcp.Item
  
  /** Provides a typesafe list of network services mapping from port number to service name.  This
    * is based on [http://www.iana.org/assignments/port-numbers] and
    * [http://www.freebsd.org/cgi/cvsweb.cgi/src/etc/services] */
  object Services {
    object Tcp extends Lookup[Int] {
      
      type Item = Port
      case class Port(name: String, portNo: Int) extends AutoAppend { def index = portNo }
      
      val tcpmux = Port("tcpmux", 1)
      val compressnet = Port("compressnet", 2)
      val compressnet2 = Port("compressnet", 3)
      val rje = Port("rje", 5)
      val echo = Port("echo", 7)
      val discard = Port("discard", 9)
      val systat = Port("systat", 11)
      val daytime = Port("daytime", 13)
      val qotd = Port("qotd", 17)
      val msp = Port("msp", 18)
      val chargen = Port("chargen", 19)
      val `ftp-data` = Port("ftp-data", 20)
      val ftp = Port("ftp", 21)
      val ssh = Port("ssh", 22)
      val telnet = Port("telnet", 23)
      val smtp = Port("smtp", 25)
      val `nsw-fe` = Port("nsw-fe", 27)
      val `msg-icp` = Port("msg-icp", 29)
      val `msg-auth` = Port("msg-auth", 31)
      val dsp = Port("dsp", 33)
      val time = Port("time", 37)
      val rap = Port("rap", 38)
      val rlp = Port("rlp", 39)
      val graphics = Port("graphics", 41)
      val nameserver = Port("nameserver", 42)
      val nicname = Port("nicname", 43)
      val `mpm-flags` = Port("mpm-flags", 44)
      val mpm = Port("mpm", 45)
      val `mpm-snd` = Port("mpm-snd", 46)
      val `ni-ftp` = Port("ni-ftp", 47)
      val auditd = Port("auditd", 48)
      val tacacs = Port("tacacs", 49)
      val `re-mail-ck` = Port("re-mail-ck", 50)
      val domain = Port("domain", 53)
      val `xns-ch` = Port("xns-ch", 54)
      val `isi-gl` = Port("isi-gl", 55)
      val `xns-auth` = Port("xns-auth", 56)
      val `xns-mail` = Port("xns-mail", 58)
      val `ni-mail` = Port("ni-mail", 61)
      val acas = Port("acas", 62)
      val `whois++` = Port("whois++", 63)
      val covia = Port("covia", 64)
      val `tacacs-ds` = Port("tacacs-ds", 65)
      val `sql*net` = Port("sql*net", 66)
      val bootps = Port("bootps", 67)
      val bootpc = Port("bootpc", 68)
      val tftp = Port("tftp", 69)
      val gopher = Port("gopher", 70)
      val `netrjs-1` = Port("netrjs-1", 71)
      val `netrjs-2` = Port("netrjs-2", 72)
      val `netrjs-3` = Port("netrjs-3", 73)
      val `netrjs-4` = Port("netrjs-4", 74)
      val deos = Port("deos", 76)
      val vettcp = Port("vettcp", 78)
      val finger = Port("finger", 79)
      val http = Port("http", 80)
      val `hosts2-ns` = Port("hosts2-ns", 81)
      val xfer = Port("xfer", 82)
      val `mit-ml-dev` = Port("mit-ml-dev", 83)
      val ctf = Port("ctf", 84)
      val `mit-ml-dev2` = Port("mit-ml-dev", 85)
      val mfcobol = Port("mfcobol", 86)
      val kerberos = Port("kerberos", 88)
      val `su-mit-tg` = Port("su-mit-tg", 89)
      val dnsix = Port("dnsix", 90)
      val `mit-dov` = Port("mit-dov", 91)
      val npp = Port("npp", 92)
      val dcp = Port("dcp", 93)
      val objcall = Port("objcall", 94)
      val supdup = Port("supdup", 95)
      val dixie = Port("dixie", 96)
      val `swift-rvf` = Port("swift-rvf", 97)
      val tacnews = Port("tacnews", 98)
      val metagram = Port("metagram", 99)
      val hostname = Port("hostname", 101)
      val `iso-tsap` = Port("iso-tsap", 102)
      val gppitnp = Port("gppitnp", 103)
      val `acr-nema` = Port("acr-nema", 104)
      val cso = Port("cso", 105)
      val `3com-tsmux` = Port("3com-tsmux", 106)
      val rtelnet = Port("rtelnet", 107)
      val snagas = Port("snagas", 108)
      val pop2 = Port("pop2", 109)
      val pop3 = Port("pop3", 110)
      val sunrpc = Port("sunrpc", 111)
      val mcidas = Port("mcidas", 112)
      val auth = Port("auth", 113)
      val sftp = Port("sftp", 115)
      val ansanotify = Port("ansanotify", 116)
      val `uucp-path` = Port("uucp-path", 117)
      val sqlserv = Port("sqlserv", 118)
      val nntp = Port("nntp", 119)
      val cfdptkt = Port("cfdptkt", 120)
      val erpc = Port("erpc", 121)
      val smakynet = Port("smakynet", 122)
      val ntp = Port("ntp", 123)
      val ansatrader = Port("ansatrader", 124)
      val `locus-map` = Port("locus-map", 125)
      val nxedit = Port("nxedit", 126)
      val `locus-con` = Port("locus-con", 127)
      val `gss-xlicen` = Port("gss-xlicen", 128)
      val pwdgen = Port("pwdgen", 129)
      val `cisco-fna` = Port("cisco-fna", 130)
      val `cisco-tna` = Port("cisco-tna", 131)
      val `cisco-sys` = Port("cisco-sys", 132)
      val statsrv = Port("statsrv", 133)
      val `ingres-net` = Port("ingres-net", 134)
      val epmap = Port("epmap", 135)
      val profile = Port("profile", 136)
      val `netbios-ns` = Port("netbios-ns", 137)
      val `netbios-dgm` = Port("netbios-dgm", 138)
      val `netbios-ssn` = Port("netbios-ssn", 139)
      val `emfis-data` = Port("emfis-data", 140)
      val `emfis-cntl` = Port("emfis-cntl", 141)
      val imap = Port("imap", 143)
      val uma = Port("uma", 144)
      val uaac = Port("uaac", 145)
      val `iso-tp0` = Port("iso-tp0", 146)
      val `iso-ip` = Port("iso-ip", 147)
      val jargon = Port("jargon", 148)
      val `aed-512` = Port("aed-512", 149)
      val `sql-net` = Port("sql-net", 150)
      val hems = Port("hems", 151)
      val bftp = Port("bftp", 152)
      val sgmp = Port("sgmp", 153)
      val `netsc-prod` = Port("netsc-prod", 154)
      val `netsc-dev` = Port("netsc-dev", 155)
      val sqlsrv = Port("sqlsrv", 156)
      val `knet-cmp` = Port("knet-cmp", 157)
      val `pcmail-srv` = Port("pcmail-srv", 158)
      val `nss-routing` = Port("nss-routing", 159)
      val `sgmp-traps` = Port("sgmp-traps", 160)
      val snmp = Port("snmp", 161)
      val snmptrap = Port("snmptrap", 162)
      val `cmip-man` = Port("cmip-man", 163)
      val `cmip-agent` = Port("cmip-agent", 164)
      val `xns-courier` = Port("xns-courier", 165)
      val `s-net` = Port("s-net", 166)
      val namp = Port("namp", 167)
      val rsvd = Port("rsvd", 168)
      val send = Port("send", 169)
      val `print-srv` = Port("print-srv", 170)
      val multiplex = Port("multiplex", 171)
      val `xyplex-mux` = Port("xyplex-mux", 173)
      val mailq = Port("mailq", 174)
      val vmnet = Port("vmnet", 175)
      val `genrad-mux` = Port("genrad-mux", 176)
      val xdmcp = Port("xdmcp", 177)
      val nextstep = Port("nextstep", 178)
      val bgp = Port("bgp", 179)
      val ris = Port("ris", 180)
      val unify = Port("unify", 181)
      val audit = Port("audit", 182)
      val ocbinder = Port("ocbinder", 183)
      val ocserver = Port("ocserver", 184)
      val `remote-kis` = Port("remote-kis", 185)
      val kis = Port("kis", 186)
      val aci = Port("aci", 187)
      val mumps = Port("mumps", 188)
      val qft = Port("qft", 189)
      val gacp = Port("gacp", 190)
      val prospero = Port("prospero", 191)
      val `osu-nms` = Port("osu-nms", 192)
      val srmp = Port("srmp", 193)
      val irc = Port("irc", 194)
      val `dn6-nlm-aud` = Port("dn6-nlm-aud", 195)
      val `dn6-smm-red` = Port("dn6-smm-red", 196)
      val dls = Port("dls", 197)
      val `dls-mon` = Port("dls-mon", 198)
      val smux = Port("smux", 199)
      val src = Port("src", 200)
      val `at-rtmp` = Port("at-rtmp", 201)
      val `at-nbp` = Port("at-nbp", 202)
      val `at-echo` = Port("at-echo", 204)
      val `at-zis` = Port("at-zis", 206)
      val qmtp = Port("qmtp", 209)
      val `z39.50` = Port("z39.50", 210)
      val anet = Port("anet", 212)
      val ipx = Port("ipx", 213)
      val imap3 = Port("imap3", 220)
      val link = Port("link", 245)
      val pawserv = Port("pawserv", 345)
      val zserv = Port("zserv", 346)
      val fatserv = Port("fatserv", 347)
      val scoi2odialog = Port("scoi2odialog", 360)
      val semantix = Port("semantix", 361)
      val srssend = Port("srssend", 362)
      val rsvp_tunnel = Port("rsvp_tunnel", 363)
      val `aurora-cmgr` = Port("aurora-cmgr", 364)
      val dtk = Port("dtk", 365)
      val odmr = Port("odmr", 366)
      val rpc2portmap = Port("rpc2portmap", 369)
      val codaauth2 = Port("codaauth2", 370)
      val clearcase = Port("clearcase", 371)
      val ulistproc = Port("ulistproc", 372)
      val ldap = Port("ldap", 389)
      val imsp = Port("imsp", 406)
      val svrloc = Port("svrloc", 427)
      val `mobileip-agent` = Port("mobileip-agent", 434)
      val `mobilip-mn` = Port("mobilip-mn", 435)
      val https = Port("https", 443)
      val snpp = Port("snpp", 444)
      val `microsoft-ds` = Port("microsoft-ds", 445)
      val kpasswd = Port("kpasswd", 464)
      val urd = Port("urd", 465)
      val photuris = Port("photuris", 468)
      val rcp = Port("rcp", 469)
      val saft = Port("saft", 487)
      val `gss-http` = Port("gss-http", 488)
      val `pim-rp-disc` = Port("pim-rp-disc", 496)
      val isakmp = Port("isakmp", 500)
      val exec = Port("exec", 512)
      val login = Port("login", 513)
      val shell = Port("shell", 514)
      val printer = Port("printer", 515)
      val videotex = Port("videotex", 516)
      val talk = Port("talk", 517)
      val ntalk = Port("ntalk", 518)
      val utime = Port("utime", 519)
      val efs = Port("efs", 520)
      val ripng = Port("ripng", 521)
      val ulp = Port("ulp", 522)
      val `ibm-db2` = Port("ibm-db2", 523)
      val ncp = Port("ncp", 524)
      val timed = Port("timed", 525)
      val tempo = Port("tempo", 526)
      val courier = Port("courier", 530)
      val conference = Port("conference", 531)
      val netnews = Port("netnews", 532)
      val netwall = Port("netwall", 533)
      val `mm-admin` = Port("mm-admin", 534)
      val iiop = Port("iiop", 535)
      val `opalis-rdv` = Port("opalis-rdv", 536)
      val nmsp = Port("nmsp", 537)
      val gdomap = Port("gdomap", 538)
      val uucp = Port("uucp", 540)
      val klogin = Port("klogin", 543)
      val kshell = Port("kshell", 544)
      val appleqtcsrvr = Port("appleqtcsrvr", 545)
      val `dhcpv6-client` = Port("dhcpv6-client", 546)
      val `dhcpv6-server` = Port("dhcpv6-server", 547)
      val afpovertcp = Port("afpovertcp", 548)
      val rtsp = Port("rtsp", 554)
      val dsf = Port("dsf", 555)
      val remotefs = Port("remotefs", 556)
      val nntps = Port("nntps", 563)
      val `9pfs` = Port("9pfs", 564)
      val whoami = Port("whoami", 565)
      val submission = Port("submission", 587)
      val `http-alt` = Port("http-alt", 591)
      val nqs = Port("nqs", 607)
      val `npmp-local` = Port("npmp-local", 610)
      val `npmp-gui` = Port("npmp-gui", 611)
      val `hmmp-ind` = Port("hmmp-ind", 612)
      val cryptoadmin = Port("cryptoadmin", 624)
      val dec_dlm = Port("dec_dlm", 625)
      val asia = Port("asia", 626)
      val `passgo-tivoli` = Port("passgo-tivoli", 627)
      val qmqp = Port("qmqp", 628)
      val `3com-amp3` = Port("3com-amp3", 629)
      val rda = Port("rda", 630)
      val ipp = Port("ipp", 631)
      val ldaps = Port("ldaps", 636)
      val tinc = Port("tinc", 655)
      val acap = Port("acap", 674)
      val asipregistry = Port("asipregistry", 687)
      val `realm-rusd` = Port("realm-rusd", 688)
      val nmap = Port("nmap", 689)
      val `ha-cluster` = Port("ha-cluster", 694)
      val epp = Port("epp", 700)
      val `iris-beep` = Port("iris-beep", 702)
      val silc = Port("silc", 706)
      val `kerberos-adm` = Port("kerberos-adm", 749)
      val `kerberos-iv` = Port("kerberos-iv", 750)
      val pump = Port("pump", 751)
      val qrh = Port("qrh", 752)
      val rrh = Port("rrh", 753)
      val tell = Port("tell", 754)
      val nlogin = Port("nlogin", 758)
      val con = Port("con", 759)
      val ns = Port("ns", 760)
      val webster = Port("webster", 765)
      val phonebook = Port("phonebook", 767)
      val rsync = Port("rsync", 873)
      val `ftps-data` = Port("ftps-data", 989)
      val ftps = Port("ftps", 990)
      val nas = Port("nas", 991)
      val telnets = Port("telnets", 992)
      val imaps = Port("imaps", 993)
      val ircs = Port("ircs", 994)
      val pop3s = Port("pop3s", 995)
      val imgames = Port("imgames", 1077)
      val socks = Port("socks", 1080)
      val rmiregistry = Port("rmiregistry", 1099)
      val bnetgame = Port("bnetgame", 1119)
      val bnetfile = Port("bnetfile", 1120)
      val hpvmmcontrol = Port("hpvmmcontrol", 1124)
      val hpvmmagent = Port("hpvmmagent", 1125)
      val hpvmmdata = Port("hpvmmdata", 1126)
      val resacommunity = Port("resacommunity", 1154)
      val `3comnetman` = Port("3comnetman", 1181)
      val `mysql-cluster` = Port("mysql-cluster", 1186)
      val alias = Port("alias", 1187)
      val openvpn = Port("openvpn", 1194)
      val kazaa = Port("kazaa", 1214)
      val bvcontrol = Port("bvcontrol", 1236)
      val nessus = Port("nessus", 1241)
      val h323hostcallsc = Port("h323hostcallsc", 1300)
      val lotusnote = Port("lotusnote", 1352)
      val `ms-sql-s` = Port("ms-sql-s", 1433)
      val `ms-sql-m` = Port("ms-sql-m", 1434)
      val ica = Port("ica", 1494)
      val wins = Port("wins", 1512)
      val ingreslock = Port("ingreslock", 1524)
      val `prospero-np` = Port("prospero-np", 1525)
      val datametrics = Port("datametrics", 1645)
      val `sa-msg-port` = Port("sa-msg-port", 1646)
      val rsap = Port("rsap", 1647)
      val `concurrent-lm` = Port("concurrent-lm", 1648)
      val kermit = Port("kermit", 1649)
      val l2tp = Port("l2tp", 1701)
      val h323gatedisc = Port("h323gatedisc", 1718)
      val h323gatestat = Port("h323gatestat", 1719)
      val h323hostcall = Port("h323hostcall", 1720)
      val iberiagames = Port("iberiagames", 1726)
      val gamegen1 = Port("gamegen1", 1738)
      val `tftp-mcast` = Port("tftp-mcast", 1758)
      val hello = Port("hello", 1789)
      val radius = Port("radius", 1812)
      val `radius-acct` = Port("radius-acct", 1813)
      val mtp = Port("mtp", 1911)
      val egs = Port("egs", 1926)
      val `unix-status` = Port("unix-status", 1957)
      val hsrp = Port("hsrp", 1985)
      val licensedaemon = Port("licensedaemon", 1986)
      val `tr-rsrb-p1` = Port("tr-rsrb-p1", 1987)
      val `tr-rsrb-p2` = Port("tr-rsrb-p2", 1988)
      val `tr-rsrb-p3` = Port("tr-rsrb-p3", 1989)
      val `stun-p1` = Port("stun-p1", 1990)
      val `stun-p2` = Port("stun-p2", 1991)
      val `stun-p3` = Port("stun-p3", 1992)
      val `snmp-tcp-port` = Port("snmp-tcp-port", 1994)
      val `stun-port` = Port("stun-port", 1995)
      val `perf-port` = Port("perf-port", 1996)
      val `gdp-port` = Port("gdp-port", 1997)
      val `x25-svc-port` = Port("x25-svc-port", 1998)
      val `tcp-id-port` = Port("tcp-id-port", 1999)
      val `cisco-sccp` = Port("cisco-sccp", 2000)
      val nfs = Port("nfs", 2049)
      val radsec = Port("radsec", 2083)
      val gnunet = Port("gnunet", 2086)
      val `rtcm-sc104` = Port("rtcm-sc104", 2101)
      val `zephyr-srv` = Port("zephyr-srv", 2102)
      val `zephyr-clt` = Port("zephyr-clt", 2103)
      val `zephyr-hm` = Port("zephyr-hm", 2104)
      val eyetv = Port("eyetv", 2170)
      val `msfw-storage` = Port("msfw-storage", 2171)
      val `msfw-s-storage` = Port("msfw-s-storage", 2172)
      val `msfw-replica` = Port("msfw-replica", 2173)
      val `msfw-array` = Port("msfw-array", 2174)
      val airsync = Port("airsync", 2175)
      val rapi = Port("rapi", 2176)
      val qwave = Port("qwave", 2177)
      val tivoconnect = Port("tivoconnect", 2190)
      val tvbus = Port("tvbus", 2191)
      val `mysql-im` = Port("mysql-im", 2273)
      val `dict-lookup` = Port("dict-lookup", 2289)
      val redstorm_join = Port("redstorm_join", 2346)
      val redstorm_find = Port("redstorm_find", 2347)
      val redstorm_info = Port("redstorm_info", 2348)
      val cvspserver = Port("cvspserver", 2401)
      val venus = Port("venus", 2430)
      val `venus-se` = Port("venus-se", 2431)
      val codasrv = Port("codasrv", 2432)
      val `codasrv-se` = Port("codasrv-se", 2433)
      val netadmin = Port("netadmin", 2450)
      val netchat = Port("netchat", 2451)
      val snifferclient = Port("snifferclient", 2452)
      val ppcontrol = Port("ppcontrol", 2505)
      val lstp = Port("lstp", 2559)
      val mon = Port("mon", 2583)
      val hpstgmgr = Port("hpstgmgr", 2600)
      val `discp-client` = Port("discp-client", 2601)
      val `discp-server` = Port("discp-server", 2602)
      val servicemeter = Port("servicemeter", 2603)
      val `nsc-ccs` = Port("nsc-ccs", 2604)
      val `nsc-posa` = Port("nsc-posa", 2605)
      val netmon = Port("netmon", 2606)
      val connection = Port("connection", 2607)
      val `wag-service` = Port("wag-service", 2608)
      val dict = Port("dict", 2628)
      val exce = Port("exce", 2769)
      val `dvr-esm` = Port("dvr-esm", 2804)
      val corbaloc = Port("corbaloc", 2809)
      val ndtp = Port("ndtp", 2882)
      val gamelobby = Port("gamelobby", 2914)
      val gds_db = Port("gds_db", 3050)
      val xbox = Port("xbox", 3074)
      val icpv2 = Port("icpv2", 3130)
      val `nm-game-admin` = Port("nm-game-admin", 3148)
      val `nm-game-server` = Port("nm-game-server", 3149)
      val mysql = Port("mysql", 3306)
      val sftu = Port("sftu", 3326)
      val trnsprntproxy = Port("trnsprntproxy", 3346)
      val `ms-wbt-server` = Port("ms-wbt-server", 3389)
      val prsvp = Port("prsvp", 3455)
      val nut = Port("nut", 3493)
      val ironstorm = Port("ironstorm", 3504)
      val `cctv-port` = Port("cctv-port", 3559)
      val `iw-mmogame` = Port("iw-mmogame", 3596)
      val distcc = Port("distcc", 3632)
      val daap = Port("daap", 3689)
      val svn = Port("svn", 3690)
      val blizwow = Port("blizwow", 3724)
      val `netboot-pxe` = Port("netboot-pxe", 3928)
      val `smauth-port` = Port("smauth-port", 3929)
      val treehopper = Port("treehopper", 3959)
      val cobraclient = Port("cobraclient", 3970)
      val cobraserver = Port("cobraserver", 3971)
      val `pxc-spvr-ft` = Port("pxc-spvr-ft", 4002)
      val `pxc-splr-ft` = Port("pxc-splr-ft", 4003)
      val `pxc-roid` = Port("pxc-roid", 4004)
      val `pxc-pin` = Port("pxc-pin", 4005)
      val `pxc-spvr` = Port("pxc-spvr", 4006)
      val `pxc-splr` = Port("pxc-splr", 4007)
      val xgrid = Port("xgrid", 4111)
      val bzr = Port("bzr", 4155)
      val rwhois = Port("rwhois", 4321)
      val epmd = Port("epmd", 4369)
      val krb524 = Port("krb524", 4444)
      val `ipsec-nat-t` = Port("ipsec-nat-t", 4500)
      val hylafax = Port("hylafax", 4559)
      val piranha1 = Port("piranha1", 4600)
      val `playsta2-app` = Port("playsta2-app", 4658)
      val `playsta2-lob` = Port("playsta2-lob", 4659)
      val snap = Port("snap", 4752)
      val `radmin-port` = Port("radmin-port", 4899)
      val rfe = Port("rfe", 5002)
      val `ita-agent` = Port("ita-agent", 5051)
      val `sdl-ets` = Port("sdl-ets", 5081)
      val bzflag = Port("bzflag", 5154)
      val aol = Port("aol", 5190)
      val `xmpp-client` = Port("xmpp-client", 5222)
      val caevms = Port("caevms", 5251)
      val `xmpp-server` = Port("xmpp-server", 5269)
      val cfengine = Port("cfengine", 5308)
      val `nat-pmp` = Port("nat-pmp", 5351)
      val `dns-llq` = Port("dns-llq", 5352)
      val mdns = Port("mdns", 5353)
      val mdnsresponder = Port("mdnsresponder", 5354)
      val llmnr = Port("llmnr", 5355)
      val `dj-ice` = Port("dj-ice", 5419)
      val `beyond-remote` = Port("beyond-remote", 5424)
      val `br-channel` = Port("br-channel", 5425)
      val postgresql = Port("postgresql", 5432)
      val `sgi-eventmond` = Port("sgi-eventmond", 5553)
      val `sgi-esphttp` = Port("sgi-esphttp", 5554)
      val cvsup = Port("cvsup", 5999)
      val x11 = Port("x11", 6000)
      val `kftp-data` = Port("kftp-data", 6620)
      val kftp = Port("kftp", 6621)
      val ktelnet = Port("ktelnet", 6623)
      val `gnutella-svc` = Port("gnutella-svc", 6346)
      val `gnutella-rtr` = Port("gnutella-rtr", 6347)
      val `sane-port` = Port("sane-port", 6566)
      val `parsec-game` = Port("parsec-game", 6582)
      val `afs3-fileserver` = Port("afs3-fileserver", 7000)
      val `afs3-callback` = Port("afs3-callback", 7001)
      val `afs3-prserver` = Port("afs3-prserver", 7002)
      val `afs3-vlserver` = Port("afs3-vlserver", 7003)
      val `afs3-kaserver` = Port("afs3-kaserver", 7004)
      val `afs3-volser` = Port("afs3-volser", 7005)
      val `afs3-errors` = Port("afs3-errors", 7006)
      val `afs3-bos` = Port("afs3-bos", 7007)
      val `afs3-update` = Port("afs3-update", 7008)
      val `afs3-rmtsys` = Port("afs3-rmtsys", 7009)
      val `font-service` = Port("font-service", 7100)
      val sncp = Port("sncp", 7560)
      val `soap-http` = Port("soap-http", 7627)
      val `http-alt2` = Port("http-alt", 8008)
      val `http-alt3` = Port("http-alt", 8080)
      val sunproxyadmin = Port("sunproxyadmin", 8081)
      val pichat = Port("pichat", 9009)
      val `bacula-dir` = Port("bacula-dir", 9101)
      val `bacula-fd` = Port("bacula-fd", 9102)
      val `bacula-sd` = Port("bacula-sd", 9103)
      val dddp = Port("dddp", 9131)
      val `wap-wsp` = Port("wap-wsp", 9200)
      val `wap-wsp-wtp` = Port("wap-wsp-wtp", 9201)
      val `wap-wsp-s` = Port("wap-wsp-s", 9202)
      val `wap-wsp-wtp-s` = Port("wap-wsp-wtp-s", 9203)
      val `wap-vcard` = Port("wap-vcard", 9204)
      val `wap-vcal` = Port("wap-vcal", 9205)
      val `wap-vcard-s` = Port("wap-vcard-s", 9206)
      val `wap-vcal-s` = Port("wap-vcal-s", 9207)
      val git = Port("git", 9418)
      val cba8 = Port("cba8", 9593)
      val davsrc = Port("davsrc", 9800)
      val sqlexec = Port("sqlexec", 9088)
      val `sqlexec-ssl` = Port("sqlexec-ssl", 9089)
      val sd = Port("sd", 9876)
      val `cyborg-systems` = Port("cyborg-systems", 9888)
      val monkeycom = Port("monkeycom", 9898)
      val `sctp-tunneling` = Port("sctp-tunneling", 9899)
      val domaintime = Port("domaintime", 9909)
      val amanda = Port("amanda", 10080)
      val vce = Port("vce", 11111)
      val smsqp = Port("smsqp", 11201)
      val hkp = Port("hkp", 11371)
      val h323callsigalt = Port("h323callsigalt", 11720)
      val `rets-ssl` = Port("rets-ssl", 12109)
      val cawas = Port("cawas", 12168)
      val bprd = Port("bprd", 13720)
      val bpdbm = Port("bpdbm", 13721)
      val `bpjava-msvc` = Port("bpjava-msvc", 13722)
      val vnetd = Port("vnetd", 13724)
      val bpcd = Port("bpcd", 13782)
      val vopied = Port("vopied", 13783)
      val xpilot = Port("xpilot", 15345)
      val wnn6 = Port("wnn6", 22273)
      val binkp = Port("binkp", 24554)
      val quake = Port("quake", 26000)
      val `wnn6-ds` = Port("wnn6-ds", 26208)
      val tetrinet = Port("tetrinet", 31457)
      val `gamesmith-port` = Port("gamesmith-port", 31765)
      val traceroute = Port("traceroute", 33434)
      val candp = Port("candp", 42508)
      val candrp = Port("candrp", 42509)
      val caerpc = Port("caerpc", 42510)
      val kpop = Port("kpop", 1109)
      val knetd = Port("knetd", 2053)
      val eklogin = Port("eklogin", 2105)
      val supfilesrv = Port("supfilesrv", 871)
      val supfiledbg = Port("supfiledbg", 1127)
      val swat = Port("swat", 901)
      val rndc = Port("rndc", 953)
      val skkserv = Port("skkserv", 1178)
      val xtel = Port("xtel", 1313)
      val support = Port("support", 1529)
      val cfinger = Port("cfinger", 2003)
      val ninstall = Port("ninstall", 2150)
      val afbackup = Port("afbackup", 2988)
      val fax = Port("fax", 4557)
      val rplay = Port("rplay", 5555)
      val canna = Port("canna", 5680)
      val `x11-ssh` = Port("x11-ssh", 6010)
      val ircd = Port("ircd", 6667)
      val jetdirect = Port("jetdirect", 9100)
      val kamanda = Port("kamanda", 10081)
      val amandaidx = Port("amandaidx", 10082)
      val amidxtape = Port("amidxtape", 10083)
      val isdnlog = Port("isdnlog", 20011)
      val vboxd = Port("vboxd", 20012)
      val wnn4_Cn = Port("wnn4_Cn", 22289)
      val wnn4_Kr = Port("wnn4_Kr", 22305)
      val wnn4_Tw = Port("wnn4_Tw", 22321)
      val asp = Port("asp", 27374)
      val tfido = Port("tfido", 60177)
      val fido = Port("fido", 60179)
    }
  }
}
