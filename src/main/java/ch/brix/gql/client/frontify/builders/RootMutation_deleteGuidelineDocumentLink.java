package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelineDocumentLink extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelineDocumentLink> {
  public RootMutation_deleteGuidelineDocumentLink() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelineDocumentLink", "DeleteGuidelineDocumentLink"));
  }
  public RootMutation_deleteGuidelineDocumentLink args(RootMutation_deleteGuidelineDocumentLink_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelineDocumentLink onDeleteGuidelineDocumentLink(On_DeleteGuidelineDocumentLink typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
