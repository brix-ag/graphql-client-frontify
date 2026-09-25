package ch.brix.gql.client.frontify.builders;

public class RootMutation_setCatalogColumnAsPrimary extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SetCatalogColumnAsPrimary> {
  public RootMutation_setCatalogColumnAsPrimary() {
    super(new ch.brix.gql.client.Call<>("setCatalogColumnAsPrimary", "SetCatalogColumnAsPrimary"));
  }
  public RootMutation_setCatalogColumnAsPrimary args(RootMutation_setCatalogColumnAsPrimary_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_setCatalogColumnAsPrimary onSetCatalogColumnAsPrimary(On_SetCatalogColumnAsPrimary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
