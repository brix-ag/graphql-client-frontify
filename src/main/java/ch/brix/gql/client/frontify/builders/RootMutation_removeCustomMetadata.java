package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeCustomMetadata extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveCustomMetadata> {
  public RootMutation_removeCustomMetadata() {
    super(new ch.brix.gql.client.Call<>("removeCustomMetadata", "RemoveCustomMetadata"));
  }
  public RootMutation_removeCustomMetadata args(RootMutation_removeCustomMetadata_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeCustomMetadata onRemoveCustomMetadata(On_RemoveCustomMetadata typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
