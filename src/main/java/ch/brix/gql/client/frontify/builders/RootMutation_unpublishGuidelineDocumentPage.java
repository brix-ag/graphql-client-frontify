package ch.brix.gql.client.frontify.builders;

public class RootMutation_unpublishGuidelineDocumentPage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UnpublishGuidelineDocumentPage> {
  public RootMutation_unpublishGuidelineDocumentPage() {
    super(new ch.brix.gql.client.Call<>("unpublishGuidelineDocumentPage", "UnpublishGuidelineDocumentPage"));
  }
  public RootMutation_unpublishGuidelineDocumentPage args(RootMutation_unpublishGuidelineDocumentPage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_unpublishGuidelineDocumentPage onUnpublishGuidelineDocumentPage(On_UnpublishGuidelineDocumentPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
