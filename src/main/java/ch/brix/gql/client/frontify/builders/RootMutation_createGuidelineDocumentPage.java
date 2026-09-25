package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelineDocumentPage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelineDocumentPage> {
  public RootMutation_createGuidelineDocumentPage() {
    super(new ch.brix.gql.client.Call<>("createGuidelineDocumentPage", "CreateGuidelineDocumentPage"));
  }
  public RootMutation_createGuidelineDocumentPage args(RootMutation_createGuidelineDocumentPage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelineDocumentPage onCreateGuidelineDocumentPage(On_CreateGuidelineDocumentPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
