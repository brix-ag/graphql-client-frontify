package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelineDocument extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelineDocument> {
  public RootMutation_deleteGuidelineDocument() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelineDocument", "DeleteGuidelineDocument"));
  }
  public RootMutation_deleteGuidelineDocument args(RootMutation_deleteGuidelineDocument_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelineDocument onDeleteGuidelineDocument(On_DeleteGuidelineDocument typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
