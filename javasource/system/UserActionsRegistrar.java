package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(pdfparser.actions.GetAuthor.class);
    registrator.registerUserAction(pdfparser.actions.GetContent.class);
    registrator.registerUserAction(pdfparser.actions.GetCreationDate.class);
    registrator.registerUserAction(pdfparser.actions.GetKeywords.class);
    registrator.registerUserAction(pdfparser.actions.GetModificationDate.class);
    registrator.registerUserAction(pdfparser.actions.GetPageCount.class);
    registrator.registerUserAction(pdfparser.actions.GetSubject.class);
    registrator.registerUserAction(pdfparser.actions.GetTitle.class);
    registrator.registerUserAction(pdfparser.actions.SetAuthor.class);
    registrator.registerUserAction(pdfparser.actions.SetCreationDate.class);
    registrator.registerUserAction(pdfparser.actions.SetKeywords.class);
    registrator.registerUserAction(pdfparser.actions.SetModificationDate.class);
    registrator.registerUserAction(pdfparser.actions.SetSubject.class);
    registrator.registerUserAction(pdfparser.actions.SetTitle.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
