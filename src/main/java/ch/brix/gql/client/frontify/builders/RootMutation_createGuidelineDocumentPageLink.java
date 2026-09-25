package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelineDocumentPageLink extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelineDocumentPageLink> {
  public RootMutation_createGuidelineDocumentPageLink() {
    super(new ch.brix.gql.client.Call<>("createGuidelineDocumentPageLink", "CreateGuidelineDocumentPageLink"));
  }
  public RootMutation_createGuidelineDocumentPageLink args(RootMutation_createGuidelineDocumentPageLink_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelineDocumentPageLink onCreateGuidelineDocumentPageLink(On_CreateGuidelineDocumentPageLink typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
