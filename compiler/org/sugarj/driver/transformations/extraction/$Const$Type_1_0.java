package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Const$Type_1_0 extends Strategy 
{ 
  public static $Const$Type_1_0 instance = new $Const$Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstType_1_0");
    Fail128:
    { 
      IStrategoTerm m_123 = null;
      IStrategoTerm l_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consConstType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      l_123 = term.getSubterm(0);
      IStrategoList annos101 = term.getAnnotations();
      m_123 = annos101;
      term = j_23.invoke(context, l_123);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consConstType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}