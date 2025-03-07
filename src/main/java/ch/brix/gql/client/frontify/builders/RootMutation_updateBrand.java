package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateBrand extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateBrand> {
  public RootMutation_updateBrand() {
    super(new ch.brix.gql.client.Call<>("updateBrand", "UpdateBrand"));
  }
  public RootMutation_updateBrand args(RootMutation_updateBrand_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateBrand onUpdateBrand(On_UpdateBrand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
