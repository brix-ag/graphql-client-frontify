package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelineDocumentGroup extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelineDocumentGroup> {
  public RootMutation_deleteGuidelineDocumentGroup() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelineDocumentGroup", "DeleteGuidelineDocumentGroup"));
  }
  public RootMutation_deleteGuidelineDocumentGroup args(RootMutation_deleteGuidelineDocumentGroup_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelineDocumentGroup onDeleteGuidelineDocumentGroup(On_DeleteGuidelineDocumentGroup typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
