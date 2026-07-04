# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,28,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,0,
        7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,
        8,5,0,0,1,8,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'nmap'", "'ss'", "'sudo'", "'tcpdump'", 
                     "'curl'", "'dig'", "'journalctl'", "'grep'", "'ufw'", 
                     "'deny'", "'from'", "'today'", "'MX'", "'--since'", 
                     "'-sV'", "'-sn'", "'-tuln'", "'-i'", "'-c'", "'-I'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'/'" ]

    symbolicNames = [ "<INVALID>", "NMAP", "SS", "SUDO", "TCPDUMP", "CURL", 
                      "DIG", "JOURNALCTL", "GREP", "UFW", "DENY", "FROM", 
                      "TODAY", "MX", "SINCE", "FLAG_SV", "FLAG_SN", "FLAG_TULN", 
                      "FLAG_I_MIN", "FLAG_C", "FLAG_I_MAY", "NUM", "CADENA", 
                      "CIDR", "IP", "RUTA", "ID", "DIAGONAL", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    NMAP=1
    SS=2
    SUDO=3
    TCPDUMP=4
    CURL=5
    DIG=6
    JOURNALCTL=7
    GREP=8
    UFW=9
    DENY=10
    FROM=11
    TODAY=12
    MX=13
    SINCE=14
    FLAG_SV=15
    FLAG_SN=16
    FLAG_TULN=17
    FLAG_I_MIN=18
    FLAG_C=19
    FLAG_I_MAY=20
    NUM=21
    CADENA=22
    CIDR=23
    IP=24
    RUTA=25
    ID=26
    DIAGONAL=27
    WS=28

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





