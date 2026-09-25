package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelineDocumentPageLink extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelineDocumentPageLink> {
  public RootMutation_updateGuidelineDocumentPageLink() {
    super(new ch.brix.gql.client.Call<>("updateGuidelineDocumentPageLink", "UpdateGuidelineDocumentPageLink"));
  }
  public RootMutation_updateGuidelineDocumentPageLink args(RootMutation_updateGuidelineDocumentPageLink_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelineDocumentPageLink onUpdateGuidelineDocumentPageLink(On_UpdateGuidelineDocumentPageLink typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
