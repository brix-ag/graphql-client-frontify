package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteCustomMetadataProperty extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteCustomMetadataProperty> {
  public RootMutation_deleteCustomMetadataProperty() {
    super(new ch.brix.gql.client.Call<>("deleteCustomMetadataProperty", "DeleteCustomMetadataProperty"));
  }
  public RootMutation_deleteCustomMetadataProperty args(RootMutation_deleteCustomMetadataProperty_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteCustomMetadataProperty onDeleteCustomMetadataProperty(On_DeleteCustomMetadataProperty typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
