package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelineDocumentPage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelineDocumentPage> {
  public RootMutation_updateGuidelineDocumentPage() {
    super(new ch.brix.gql.client.Call<>("updateGuidelineDocumentPage", "UpdateGuidelineDocumentPage"));
  }
  public RootMutation_updateGuidelineDocumentPage args(RootMutation_updateGuidelineDocumentPage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelineDocumentPage onUpdateGuidelineDocumentPage(On_UpdateGuidelineDocumentPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
