package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelineDocumentPage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelineDocumentPage> {
  public RootMutation_deleteGuidelineDocumentPage() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelineDocumentPage", "DeleteGuidelineDocumentPage"));
  }
  public RootMutation_deleteGuidelineDocumentPage args(RootMutation_deleteGuidelineDocumentPage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelineDocumentPage onDeleteGuidelineDocumentPage(On_DeleteGuidelineDocumentPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
