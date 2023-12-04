package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteAttachment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteAttachment> {
  public RootMutation_deleteAttachment() {
    super(new ch.brix.gql.client.Call<>("deleteAttachment", "DeleteAttachment"));
  }
  public RootMutation_deleteAttachment args(RootMutation_deleteAttachment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteAttachment onDeleteAttachment(On_DeleteAttachment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
