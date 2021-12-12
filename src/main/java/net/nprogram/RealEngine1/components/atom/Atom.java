package net.nprogram.RealEngine1.components.atom;

import net.nprogram.RealEngine1.logging.Logging;

import java.util.logging.Level;

public enum Atom {
    H(1,1,1,1), He(2,1,8,4.0026),
    Li(3,2,1,6.94), Be(4,2,2,9.0122), B(5,2,3,10.81), C(6,2,4,12.011), N(7,2,5,14.007), O(8,2,6,15.999), F(9,2,7,15.999), Ne(10,2,8,20.180),
    Na(11,3,1,22.990), Mg(12,3,2,24.305), Al(13,3,3,26.982), Si(14,3,4,28.085), P(15,3,5,30.974), S(16,3,6,32.06), Cl(17,3,7,35.45), Ar(18,3,8,39.948),
    K(19,4,1,0), Ca(20,4,2,0), Sc(21,4,3,0), Ti(22,4,4,0), V(23,4,5,0), Cr(24,4,6,0), Mn(25,4,7,0), Fe(26,4,8,0), Co(27,4,8,0), Ni(28,4,8,0), Cu(29,4,1,0), Zn(30,4,2,0), Ga(31,4,3,0), Ge(32,4,4,0), As(33,4,5,0), Se(34,4,6,0), Br(35,4,7,0), Kr(36,4,8,0),
    Rb(37,5,1,0), Sr(38,5,2,0), Y(39,5,3,0), Zr(40,5,4,0), Nb(41,5,5,0), Mo(42,5,6,0), Tc(43,5,7,0), Ru(44,5,8,0), Rh(45,5,8,0), Pd(46,5,8,0), Ag(47,5,1,0), Cd(48,5,2,0), In(49,5,3,0), Sn(50,5,4,0), Sb(51,5,5,0), Te(52,5,6,0), I(53,5,7,0), Xe(54,5,8,0),
    Cs(55,6,1,0), Ba(56,6,2,0), La(57,6,3,0), Ce(58,6,3,0), Pr(59,6,3,0), Nd(60,6,3,0), Pm(61,6,3,0), Sm(62,6,3,0), Eu(63,6,3,0), Gd(64,6,3,0), Tb(65,6,3,0), Dy(66,6,3,0), Ho(67,6,3,0), Er(68,6,3,0), Tm(69,6,3,0), Yb(70,6,3,0), Lu(71,6,3,0), Hf(72,6,4,0), Ta(73,6,5,0), W(74,6,6,0), Re(75,6,7,0), Os(76,6,8,0), Ir(77,6,8,0), Pt(78,6,8,0), Au(79,6,1,0), Hg(80,6,2,0), Tl(81,6,3,0), Pb(82,6,4,0), Bi(83,6,5,0), Po(84,6,6,0), At(85,6,7,0), Rn(86,6,8,0),
    Fr(87,7,1,0), Ra(88,7,2,0), Ac(89,7,3,0), Th(90,7,3,0), Pa(91,7,3,0), U(92,7,3,0), Np(93,7,3,0), Pu(94,7,3,0), Am(95,7,3,0), Cm(96,7,3,0), Bk(97,7,3,0), Cf(98,7,3,0), Es(99,7,3,0), Fm(100,7,3,0), Md(101,7,3,0), No(102,7,3,0), Lr(103,7,3,0), Rf(104,7,4,0), Db(105,7,5,0), Sg(106,7,6,0), Bh(107,7,7,0), Hs(108,7,8,0), Mt(109,7,8,0), Ds(110,7,8,0), Rg(111,7,1,0), Cn(112,7,2,0), Nh(113,7,3,0), Fl(114,7,4,0), Mc(115,7,5,0), Lv(116,7,6,0), Ts(117,7,7,0), Og(118,7,8,0);
    private int ordinalnumber = 0;
    private int period = 0;
    private int group = 0;
    private double atomicMass = 0.0;

    Atom(int ordinalnumber,int period,int group,double atomicMass){
        this.ordinalnumber = ordinalnumber;
        this.period = period;
        this.group = group;
        this.atomicMass = atomicMass;
    }
    public void getValue(Level level){
        Logging.log(level,this.ordinalnumber);
        Logging.log(level,this.period);
        Logging.log(level,this.group);
        Logging.log(level,this.atomicMass);
    }
}
