package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelineDocumentPageLink extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelineDocumentPageLink> {
  public RootMutation_deleteGuidelineDocumentPageLink() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelineDocumentPageLink", "DeleteGuidelineDocumentPageLink"));
  }
  public RootMutation_deleteGuidelineDocumentPageLink args(RootMutation_deleteGuidelineDocumentPageLink_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelineDocumentPageLink onDeleteGuidelineDocumentPageLink(On_DeleteGuidelineDocumentPageLink typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
