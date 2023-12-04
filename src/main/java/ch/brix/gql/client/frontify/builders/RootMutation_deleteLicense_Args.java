package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteLicense_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `DeleteLicense` input argument.
   * Default value: null
   */
  public RootMutation_deleteLicense_Args input(ch.brix.gql.client.frontify.input_objects.DeleteLicenseInput value) {
    _add_arg("input", value);
    return this;
  }
}
