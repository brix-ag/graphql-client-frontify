package ch.brix.gql.client.frontify.builders;

public class RootMutation_createBrand extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateBrand> {
  public RootMutation_createBrand() {
    super(new ch.brix.gql.client.Call<>("createBrand", "CreateBrand"));
  }
  public RootMutation_createBrand args(RootMutation_createBrand_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createBrand onCreateBrand(On_CreateBrand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
