package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteBrand extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteBrand> {
  public RootMutation_deleteBrand() {
    super(new ch.brix.gql.client.Call<>("deleteBrand", "DeleteBrand"));
  }
  public RootMutation_deleteBrand args(RootMutation_deleteBrand_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteBrand onDeleteBrand(On_DeleteBrand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
