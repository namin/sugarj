package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class accept_str_0_0 extends Strategy 
{ 
  public static accept_str_0_0 instance = new accept_str_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1:
    { 
      IStrategoTerm a_15 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._constransformation_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1;
      a_15 = term.getSubterm(0);
      term = a_15;
      if(true)
        return term;
    }
    context.push("accept_str_0_0");
    context.popOnFailure();
    return null;
  }
}