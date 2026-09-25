package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelineDocumentLink extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelineDocumentLink> {
  public RootMutation_updateGuidelineDocumentLink() {
    super(new ch.brix.gql.client.Call<>("updateGuidelineDocumentLink", "UpdateGuidelineDocumentLink"));
  }
  public RootMutation_updateGuidelineDocumentLink args(RootMutation_updateGuidelineDocumentLink_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelineDocumentLink onUpdateGuidelineDocumentLink(On_UpdateGuidelineDocumentLink typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
