using AutoGrad;

Matrix ik = new(2,2);
Value h = ik.Values[1][1] + ik.Values[1][0];
Value ha = ik.Values[1][1] - ik.Values[1][0];
Value hb = ik.Values[1][1] * ik.Values[1][0];
Value hc = ik.Values[1][1] / ik.Values[1][0];
Value hg = ik.Values[1][1];
Value b = ik.Values[1][1];
