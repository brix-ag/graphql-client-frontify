package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteMetadataField extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteMetadataField> {
  public RootMutation_deleteMetadataField() {
    super(new ch.brix.gql.client.Call<>("deleteMetadataField", "DeleteMetadataField"));
  }
  public RootMutation_deleteMetadataField args(RootMutation_deleteMetadataField_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteMetadataField onDeleteMetadataField(On_DeleteMetadataField typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
