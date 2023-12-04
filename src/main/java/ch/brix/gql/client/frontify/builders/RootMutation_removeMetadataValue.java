package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeMetadataValue extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveMetadataValue> {
  public RootMutation_removeMetadataValue() {
    super(new ch.brix.gql.client.Call<>("removeMetadataValue", "RemoveMetadataValue"));
  }
  public RootMutation_removeMetadataValue args(RootMutation_removeMetadataValue_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeMetadataValue onRemoveMetadataValue(On_RemoveMetadataValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
