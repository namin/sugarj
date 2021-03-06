package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Strategies_1_0 extends Strategy 
{ 
  public static $Strategies_1_0 instance = new $Strategies_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Strategies_1_0");
    Fail59:
    { 
      IStrategoTerm d_110 = null;
      IStrategoTerm c_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consStrategies_1 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      c_110 = term.getSubterm(0);
      IStrategoList annos35 = term.getAnnotations();
      d_110 = annos35;
      term = q_18.invoke(context, c_110);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consStrategies_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}