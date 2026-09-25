package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelineDocumentGroup extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelineDocumentGroup> {
  public RootMutation_updateGuidelineDocumentGroup() {
    super(new ch.brix.gql.client.Call<>("updateGuidelineDocumentGroup", "UpdateGuidelineDocumentGroup"));
  }
  public RootMutation_updateGuidelineDocumentGroup args(RootMutation_updateGuidelineDocumentGroup_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelineDocumentGroup onUpdateGuidelineDocumentGroup(On_UpdateGuidelineDocumentGroup typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
