package ch.brix.gql.client.frontify.builders;

public class RootMutation_publishGuidelineDocumentPage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.PublishGuidelineDocumentPage> {
  public RootMutation_publishGuidelineDocumentPage() {
    super(new ch.brix.gql.client.Call<>("publishGuidelineDocumentPage", "PublishGuidelineDocumentPage"));
  }
  public RootMutation_publishGuidelineDocumentPage args(RootMutation_publishGuidelineDocumentPage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_publishGuidelineDocumentPage onPublishGuidelineDocumentPage(On_PublishGuidelineDocumentPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
