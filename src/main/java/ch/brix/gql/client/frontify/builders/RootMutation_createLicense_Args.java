package ch.brix.gql.client.frontify.builders;

public class RootMutation_createLicense_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `CreateLicense` input argument.
   * Default value: null
   */
  public RootMutation_createLicense_Args input(ch.brix.gql.client.frontify.input_objects.CreateLicenseInput value) {
    _add_arg("input", value);
    return this;
  }
}
