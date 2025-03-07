package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAttachment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateAttachment> {
  public RootMutation_createAttachment() {
    super(new ch.brix.gql.client.Call<>("createAttachment", "CreateAttachment"));
  }
  public RootMutation_createAttachment args(RootMutation_createAttachment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createAttachment onCreateAttachment(On_CreateAttachment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
