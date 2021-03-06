package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class real_1_0 extends Strategy 
{ 
  public static real_1_0 instance = new real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("real_1_0");
    Fail265:
    { 
      IStrategoTerm b_149 = null;
      IStrategoTerm a_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consreal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail265;
      a_149 = term.getSubterm(0);
      IStrategoList annos219 = term.getAnnotations();
      b_149 = annos219;
      term = s_29.invoke(context, a_149);
      if(term == null)
        break Fail265;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consreal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}