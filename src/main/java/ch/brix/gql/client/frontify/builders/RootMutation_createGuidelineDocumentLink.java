package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelineDocumentLink extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelineDocumentLink> {
  public RootMutation_createGuidelineDocumentLink() {
    super(new ch.brix.gql.client.Call<>("createGuidelineDocumentLink", "CreateGuidelineDocumentLink"));
  }
  public RootMutation_createGuidelineDocumentLink args(RootMutation_createGuidelineDocumentLink_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelineDocumentLink onCreateGuidelineDocumentLink(On_CreateGuidelineDocumentLink typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
