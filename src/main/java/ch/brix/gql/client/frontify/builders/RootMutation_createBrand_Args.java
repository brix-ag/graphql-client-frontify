package ch.brix.gql.client.frontify.builders;

public class RootMutation_createBrand_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `CreateBrand` input argument.
   * Default value: null
   */
  public RootMutation_createBrand_Args input(ch.brix.gql.client.frontify.input_objects.CreateBrandInput value) {
    _add_arg("input", value);
    return this;
  }
}
